package sample.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import sample.Model.List;
import sample.Model.SharedData;
import sample.Model.User;

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



