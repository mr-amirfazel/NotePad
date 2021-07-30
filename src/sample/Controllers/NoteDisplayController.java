package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Model.SharedData;

import java.net.URL;
import java.util.ResourceBundle;

public class NoteDisplayController implements Initializable {
    private SharedData sharedData = SharedData.getInstance();

    @FXML
    private Label titlelabel;

    @FXML
    private Label noteTextLabel;

    @FXML
    private AnchorPane noteDisplay;

    @FXML
    void goToNoteBook(MouseEvent event) {
            new PageManager().goToDay(noteDisplay);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            titlelabel.setText(sharedData.note.getTitle());
            noteTextLabel.setText(sharedData.note.getNote());
    }
}
