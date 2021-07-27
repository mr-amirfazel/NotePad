package sample.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class SceneLoader {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public SceneLoader() { }

    public void goToSignUpPage(Pane pane)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../View/SignUp.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage = (Stage) pane.getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("../View/Styles/SignUp.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Sign Up");
        stage.setScene(scene);
        stage.show();
    }
    public void goToMainMenu(Pane pane)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../View/MainMenu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage) pane.getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("../View/Styles/MainMenu.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    public void goToLogIn(Pane pane)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../View/LogIn.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage) pane.getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("../View/Styles/LogIn.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("LogIn");
        stage.setScene(scene);
        stage.show();
    }
    public void goToNotesMenu(Pane pane)
    {
        try {
            root = FXMLLoader.load(getClass().getResource("../View/NotesMenu.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage) pane.getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("../View/Styles/NotesMenu.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setTitle("Notes Menu");
        stage.setScene(scene);
        stage.show();
    }

}
