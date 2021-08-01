package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import sample.Model.SharedData;
import sample.Model.WeekDay;

public class NoteBookController {

    private SceneLoader sceneLoader = new SceneLoader();
    private SharedData sharedData = SharedData.getInstance();

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
        sharedData.weekDay = WeekDay.MONDAY;
        sceneLoader.goToDayList(NoteBook);
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
