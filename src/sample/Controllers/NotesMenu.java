package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import sample.Model.SharedData;
import sample.Model.User;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.IntBinaryOperator;

public class NotesMenu implements Initializable {
    private SceneLoader sceneLoader = new SceneLoader();
    private User user = SharedData.getInstance().user;

    @FXML
    private Pane NotesMenuPane;

    @FXML
    private VBox profileBox;

    @FXML
    private HBox NotesHBox;

    @FXML
    private Label notes;

    @FXML
    private HBox CheckedNotesHBox;

    @FXML
    private Label checkedNotes;

    @FXML
    private HBox StarredNotesHBox;

    @FXML
    private Label starredNotes;

    @FXML
    private Circle profileHolder;

    @FXML
    private Button myNoteBookButton;

    @FXML
    private Button GoBackButton;

    @FXML
    private Button settingButton;

    @FXML
    void goToMainmenu(ActionEvent event) {
        sceneLoader.goToMainMenu(NotesMenuPane);
    }

    @FXML
    void goToNoteBook(ActionEvent event) {
        sceneLoader.goToNoteBook(NotesMenuPane);
    }

    @FXML
    void goToSetting(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image image = new Image("pfp.jpg");
        profileHolder.setFill(new ImagePattern(image));

    }
}