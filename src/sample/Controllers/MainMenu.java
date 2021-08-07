package sample.Controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


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
        alert.setHeaderText("Note Pad");


        VBox Pane = new VBox();
        Pane.getChildren().add(new Label("""
                Note Pad (second version of ToDoList)
                implemented in java
                developed by AmirFazel Koozegar
                """));
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
