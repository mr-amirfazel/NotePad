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

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        User user = new User("1","1");
        user.getNoteBook().getLists()[0].getNotes().add(new Note("hello world","hello!"));
        SharedData.getInstance().user=user;
        Parent root = FXMLLoader.load(getClass().getResource("View/MainMenu.fxml"));
        primaryStage.setTitle("NotePad");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        String css = this.getClass().getResource("View/Styles/MainMenu.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.getIcons().add(new Image("ico.png"));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
