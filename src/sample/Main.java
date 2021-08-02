package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.Model.Note;
import sample.Model.SharedData;
import sample.Model.User;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View/MainMenu.fxml")));
        primaryStage.setTitle("NotePad");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        String css = Objects.requireNonNull(this.getClass().getResource("View/Styles/MainMenu.css")).toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.getIcons().add(new Image("ico.png"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
