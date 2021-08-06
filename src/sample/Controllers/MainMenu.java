package sample.Controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
        Alert alert = new Alert(Alert.AlertType.INFORMATION)
                ;
        alert.setTitle("Info");
        alert.setContentText("" +
                "Note Pad (second version of ToDoList)\n" +
                "implemented in java\n" +
                "developed by AmirFazel Koozegar\n");
        alert.setHeaderText("Note Pad");


        VBox Pane = new VBox();
        Pane.getChildren().add(new Label("Note Pad (second version of ToDoList)\n" +
                "implemented in java\n" +
                "developed by AmirFazel Koozegar\n"));
        ImageView imageView = new ImageView(new Image("notepad.jpg"));
        Pane.getChildren().add(imageView);

        alert.getDialogPane().setContent(Pane);
        alert.setResizable(true);

        alert.show();
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
