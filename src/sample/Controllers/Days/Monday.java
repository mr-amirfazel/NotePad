package sample.Controllers.Days;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import sample.Controllers.SceneLoader;
import sample.Model.Note;
import sample.Model.SharedData;
import sample.Model.User;
import sample.Model.WeekDay;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Monday implements Initializable {
    private SharedData sharedData = SharedData.getInstance();
    private User user = sharedData.user;
    private SceneLoader  sceneLoader = new SceneLoader();

    @FXML
    private AnchorPane MondayBG;

    @FXML
    private Button addNoteMonday;

    @FXML
    private FlowPane MondayList;

    @FXML
    void ComposeNoteMonday(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sharedData.weekDay = WeekDay.MONDAY;
      ArrayList<Note> notes = user.getNoteBook().getLists()[0].getNotes();
      for (Note note:notes)
      {
          Button button = new Button(note.getTitle());
          button.setPrefWidth(MondayList.getPrefWidth()*0.25);
          button.setPrefHeight(60);
          button.setStyle("-fx-background-color: #6B8E23;" +
                  "-fx-text-fill: #F4A460;" +
                  "-fx-font-size: 16px");
          button.setCursor(Cursor.HAND);
          button.setOnMouseClicked(new EventHandler<MouseEvent>() {
              @Override
              public void handle(MouseEvent mouseEvent) {
                  sharedData.note = note;
                  sceneLoader.viewNote(MondayBG);
              }
          });
          MondayList.getChildren().add(button);
      }
    }
}
