package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class SignUp {
    private final SceneLoader sceneLoader = new SceneLoader();

    @FXML
    private Pane SignUpPane;

    @FXML
    private Button SignUpButton;

    @FXML
    private Button goBackButton;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passField;

    @FXML
    private PasswordField secPassField;
    @FXML
    private Label stateLabel;

    @FXML
    void goToMain() {
        sceneLoader.goToMainMenu(SignUpPane);
    }

    @FXML
    void signUpUser(ActionEvent event) {
        if(passField.getText().equals(secPassField.getText()))
        {
            stateLabel.setText("sign Up was successful");
        }
        else
            stateLabel.setText("password fields doesnt match :(");

    }

}
