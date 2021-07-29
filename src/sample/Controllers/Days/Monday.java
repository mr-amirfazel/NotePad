package sample.Controllers.Days;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import sample.Model.SharedData;
import sample.Model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class Monday implements Initializable {
    private SharedData sharedData = SharedData.getInstance();
    private User user = sharedData.user;

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

    }
}
