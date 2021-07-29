package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View/MainMenu.fxml"));
        primaryStage.setTitle("NotePad");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        String css = this.getClass().getResource("View/Styles/MainMenu.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
