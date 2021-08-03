package sample.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;
import sample.Model.FileUtils;
import sample.Model.List;
import sample.Model.SharedData;
import sample.Model.User;

import java.io.File;
import java.nio.file.Files;
import java.util.Optional;

public class Setting {
    private SceneLoader sceneLoader = new SceneLoader();
    private User user = SharedData.getInstance().user;
    @FXML
    private AnchorPane settingPane;

    @FXML
    private Button removeNotes;

    @FXML
    private Button returnBtn;

    @FXML
    private Button myInfoButton;

    @FXML
    private Button profilePic;

    @FXML
    void alterProfilePic(ActionEvent event) {
        Stage stage = (Stage) settingPane.getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");


        File file = fileChooser.showOpenDialog(stage);
        System.out.println(file.getAbsolutePath());
        String[] fileSplit = file.getAbsolutePath().split("\\.");
        String format = fileSplit[fileSplit.length-1];
        System.out.println(format);

       String newProfilePath =  FileUtils.copyProfilePic(file.toPath(),format);
        System.out.println("setting "+newProfilePath);
       user.setPfpPath(newProfilePath);

       conFirmPicChange();
        new FileUtils().savePlayer(user);
    }

    private void conFirmPicChange() {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Profile Pic Changed successfully");
        a.show();
    }

    @FXML
    void removeAllNotes(ActionEvent event) {
        if (sendWarning()) {
            for (List list :user.getNoteBook().getLists())
            {
                list.getNotes().clear();
            }
            confirmDelete();
        }
    }

    @FXML
    void returnToMenu(ActionEvent event) {
        sceneLoader.goToNotesMenu(settingPane);
    }

    @FXML
    void userInfo(ActionEvent event) {

    }

    private void confirmDelete() {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Note's Deleted successfully");
        Optional<ButtonType> result = a.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if (button == ButtonType.OK) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            new SceneLoader().goToSetting(settingPane);
                        }
                    });
                }
            }).start();
        }
    }

    private boolean sendWarning() {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText("Are you Sure you want to delete all of your Notes?");
        Optional<ButtonType> result = a.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if (button == ButtonType.OK) {
            return true;
        } else
            return false;
    }
}



