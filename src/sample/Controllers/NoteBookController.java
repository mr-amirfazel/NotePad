package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class NoteBookController {

    @FXML
    private GridPane NoteBook;

    @FXML
    private Button MondayButton;

    @FXML
    private Button sundayButton;

    @FXML
    private Button saturdayButton;

    @FXML
    private Button fridayButton;

    @FXML
    private Button thursdayButton;

    @FXML
    private Button wednesdayButton;

    @FXML
    private Button tuesdayButton;

    @FXML
    private Button redirectB;

    @FXML
    void goToFridayList(ActionEvent event) {

    }

    @FXML
    void goToMondayList(ActionEvent event) {

    }

    @FXML
    void goToSaturdayList(ActionEvent event) {

    }

    @FXML
    void goToThursdayList(ActionEvent event) {

    }

    @FXML
    void goToTuesdayList(ActionEvent event) {

    }

    @FXML
    void goToWednesdayList(ActionEvent event) {

    }

    @FXML
    void gotoMenu(ActionEvent event) {
            new SceneLoader().goToNotesMenu(NoteBook);
    }

    @FXML
    void gotoSundayList(ActionEvent event) {

    }

}
