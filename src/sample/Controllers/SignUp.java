package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.Model.FileUtils;
import sample.Model.User;

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
    void signUpUser() {
        FileUtils fileUtils = new FileUtils();
        if(passField.getText().equals(secPassField.getText()))
        {
            if(!fileUtils.userExist(usernameField.getText())) {
                stateLabel.setText("sign Up was successful");
                fileUtils.savePlayer(new User(usernameField.getText(), passField.getText()));
            }
            else
                stateLabel.setText("this user already exist");

        }
        else
            stateLabel.setText("password fields doesnt match :(");

    }

}
