package sample.Controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Model.FileUtils;
import sample.Model.SharedData;
import sample.Model.User;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class NoteDisplayController implements Initializable {
    private final SharedData sharedData = SharedData.getInstance();
    private final User user = sharedData.user;

    @FXML
    private Label titleLabel;

    @FXML
    private Label noteTextLabel;

    @FXML
    private AnchorPane noteDisplay;

    @FXML
    private ImageView starState;
    @FXML
    private CheckBox checkState;

    @FXML
    void starUnStar(MouseEvent event) {
        sharedData.note.setStarred(!sharedData.note.isStarred());
        setStar();
        new FileUtils().savePlayer(user);

    }
    @FXML
    void goToNoteBook(MouseEvent event) {
        new SceneLoader().goToDayList(noteDisplay);
    }

    @FXML
    void deleteNote(MouseEvent event) {
        if(sendWarning())
        {
            sharedData.user.getNoteBook().getLists()[new PageManager().getIndex()].getNotes().remove(sharedData.note);
             new FileUtils().savePlayer(sharedData.user);
            confirmDelete();
        }
    }

    @FXML
    void checkNote(ActionEvent event) {
        sharedData.note.setChecked(!sharedData.note.isChecked());
        setStar();
        new FileUtils().savePlayer(user);
    }

    private void confirmDelete() {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setContentText("Note Deleted successfully");
        Optional<ButtonType> result = a.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        if (button == ButtonType.OK) {
            new Thread(() -> Platform.runLater(() -> new SceneLoader().goToDayList(noteDisplay))).start();
        }
    }

    private boolean sendWarning() {
        Alert a = new Alert(Alert.AlertType.WARNING);
        a.setContentText("Are you Sure you want to delete this note?");
        Optional<ButtonType> result = a.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);
        return button == ButtonType.OK;
    }



    @Override
        public void initialize (URL url, ResourceBundle resourceBundle){
            titleLabel.setText(sharedData.note.getTitle());
            noteTextLabel.setText(sharedData.note.getNote());
            setStar();
            setCheck();
        }

    private void setCheck() {
        checkState.setSelected(SharedData.getInstance().note.isChecked());

    }

    private void setStar() {
        if (SharedData.getInstance().note.isStarred())
            starState.setImage(new Image("starred.png"));
        else
            starState.setImage(new Image("unstar.png"));
    }
}

