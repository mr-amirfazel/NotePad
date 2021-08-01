package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;

public class DayList {

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

    }
    @FXML
    void composeNewNote(ActionEvent event) {

    }

}
