package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Model.FileUtils;
import sample.Model.SharedData;
import sample.Model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class Profile implements Initializable {
    private final SceneLoader sceneLoader = new SceneLoader();
    private final User user = SharedData.getInstance().user;

    @FXML
    private AnchorPane infoPane;

    @FXML
    private Label usernameDisplay;

    @FXML
    private TextField nameField;

    @FXML
    private TextField settingPassField;
    @FXML
    private DatePicker birthDate;

    @FXML
    void goToSetting(MouseEvent event) {
        sceneLoader.goToSetting(infoPane);
    }

    @FXML
    void saveProfile() {
        if (!nameField.getText().equals(""))
        {
            if (!settingPassField.getText().equals(""))
            {
                user.setPassword(settingPassField.getText());
                user.setName(nameField.getText());
                user.setBirthDate(birthDate.getValue());
                new FileUtils().savePlayer(user);
            }
        }
    }
    @FXML
    void handleKeyEvent(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER)
        {
            saveProfile();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usernameDisplay.setText(user.getUsername()+"'s User Info");
        nameField.setPromptText(user.getName());
        settingPassField.setPromptText(user.getPassword());
        birthDate.setValue(user.getBirthDate());
    }
}
