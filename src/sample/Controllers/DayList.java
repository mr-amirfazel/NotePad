package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import sample.Model.Note;
import sample.Model.SharedData;
import sample.Model.User;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DayList implements Initializable {
    private SceneLoader sceneLoader = new SceneLoader();

    @FXML
    private AnchorPane DayListBG;

    @FXML
    private Label dayNameLabel;

    @FXML
    private FlowPane dayNotes;

    @FXML
    private VBox sideList;

    @FXML
    private Button addNote;

    @FXML
    void redirectToNoteBook(MouseEvent event) {
        sceneLoader.goToNotesMenu(DayListBG);
    }
    @FXML
    void composeNewNote(ActionEvent event) {
        sceneLoader.addNote(DayListBG);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SharedData sharedData = SharedData.getInstance();
        User user = sharedData.user;
        dayNameLabel.setText(sharedData.weekDay +"'s Sheet :)");
        ArrayList<Note> notes = user.getNoteBook().getLists()[new PageManager().getIndex()].getNotes();
        for (Note note:notes)
        {
            Button button = new Button(note.getTitle());
            button.setPrefWidth(dayNotes.getPrefWidth()*0.25);
            button.setPrefHeight(60);
            button.setStyle("-fx-background-color: #6B8E23;" +
                    "-fx-text-fill: #F4A460;" +
                    "-fx-font-size: 16px");
            button.setCursor(Cursor.HAND);
            button.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    sharedData.note = note;
                    sceneLoader.viewNote(DayListBG);
                }
            });
            dayNotes.getChildren().add(button);
        }
    }
}
