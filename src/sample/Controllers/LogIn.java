package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.Model.SharedData;
import sample.Model.User;

public class LogIn {
    private final SceneLoader sceneLoader = new SceneLoader();
    private SharedData sharedData = SharedData.getInstance();

    @FXML
    private Label usernameLabel;

    @FXML
    private Label passLabel;

    @FXML
    private Button LogInButton;
    @FXML
    private Pane LogInPane;
    @FXML
    private PasswordField LogInPassField;

    @FXML
    private TextField LogInUserField;

    @FXML
    private Label loginState;

    @FXML
    void goToMainMenu(ActionEvent event) {
        sceneLoader.goToMainMenu(LogInPane);
    }

    @FXML
    void goToNotesMenu(ActionEvent event) {
            if(validUser())
            {
                sceneLoader.goToNotesMenu(LogInPane);
            }
    }
    private boolean validUser()
    {
        boolean bool = false;
        User user = sharedData.user;
        if(user.getUsername().equals(LogInUserField.getText())&&user.getPassword().equals(LogInPassField.getText()))
            bool = true;
        else if(user.getUsername().equals(LogInUserField.getText())&& !user.getPassword().equals(LogInPassField.getText()))
            loginState.setText("password is wrong");
        else if(!user.getUsername().equals(LogInUserField.getText()))
            loginState.setText("user does not exist");


        return bool;
    }


}
