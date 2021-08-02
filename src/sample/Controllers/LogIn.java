package sample.Controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import sample.Model.FileUtils;
import sample.Model.SharedData;
import sample.Model.User;

public class LogIn {
    private final SceneLoader sceneLoader = new SceneLoader();

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
    void goToMainMenu() {
        sceneLoader.goToMainMenu(LogInPane);
    }

    @FXML
    void goToNotesMenu() {

        FileUtils fileUtils = new FileUtils();
        if (fileUtils.userExist(LogInUserField.getText()))
        {
            User user = fileUtils.getUser(LogInUserField.getText());
            if (user.getPassword().equals(LogInPassField.getText())) {
                SharedData.getInstance().user = user;
                sceneLoader.goToNotesMenu(LogInPane);
            }
            else
                loginState.setText("Pass word doesnt match :(");
        }
        else
            usernameLabel.setText("User does not exist!");
    }



}
