package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenu implements Initializable {
    private SceneLoader sceneLoader;

    @FXML
    private Pane mainMenuPane;

    @FXML
    private Button signUpButton;

    @FXML
    private Button infoButton;

    @FXML
    private Button logInButton;

    public MainMenu() {
    }

    @FXML
    void goToInfo(ActionEvent event) {

    }

    @FXML
    void goToLogin(ActionEvent event) {
        sceneLoader.goToLogIn(mainMenuPane);
    }

    @FXML
    void goToSignUp() {
            sceneLoader.goToSignUpPage(mainMenuPane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sceneLoader = new SceneLoader();
    }
}
