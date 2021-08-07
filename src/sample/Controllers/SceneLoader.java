package sample.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Model.SharedData;
import java.io.IOException;
import java.util.Objects;

public class SceneLoader {
    private Parent root;

    private String fxmlFile = "../View/";
    private String cssFile ="../View/Styles/";
    private String title;

    public SceneLoader() { }

    public void goToSignUpPage(Pane pane)
    {
        fxmlFile+="SignUp.fxml";
        cssFile+="SignUp.css";
        title ="Sign Up";
        redirectPage(pane);
    }
    public void goToMainMenu(Pane pane)
    {
        fxmlFile+="MainMenu.fxml";
        cssFile+="MainMenu.css";
        title ="Welcome";
        redirectPage(pane);
    }
    public void goToLogIn(Pane pane)
    {
        fxmlFile+="LogIn.fxml";
        cssFile+="LogIn.css";
        title ="LogIn";
        redirectPage(pane);

    }
    public void goToNotesMenu(Pane pane)
    {
        fxmlFile+="NotesMenu.fxml";
        cssFile+="NotesMenu.css";
        title ="Notes Menu";
        redirectPage(pane);
    }
    public void goToNoteBook(Pane pane)
    {
        fxmlFile+="NoteBook.fxml";
        cssFile+="NoteBook.css";
        title ="Note Book";
        redirectPage(pane);
    }
     public void goToDayList(Pane pane)
    {
        fxmlFile+="DayList.fxml";
        cssFile+="DayList.css";
        title = SharedData.getInstance().weekDay+"";
        redirectPage(pane);
    }
    public void viewNote(Pane pane)
    {
        fxmlFile+="NoteDisplay.fxml";
        cssFile+="NoteDisplay.css";
        title ="Note Viewer";
        redirectPage(pane);
    }
    public void addNote(Pane pane)
    {
        fxmlFile+="NoteCompose.fxml";
        cssFile+="NoteCompose.css";
        title ="Compose new Note";
        redirectPage(pane);
    }
    public void goToSetting(Pane pane)
    {
        fxmlFile+="Setting.fxml";
        cssFile+="Setting.css";
        title ="User setting";
        redirectPage(pane);
    }
    public void goToInfo(Pane pane)
    {
        fxmlFile+="UserProfile.fxml";
        cssFile+="Profile.css";
        title ="User Profile";
        redirectPage(pane);
    }


    private void redirectPage(Pane pane)
    {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(fxmlFile)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = (Stage) pane.getScene().getWindow();
        Scene scene = new Scene(root);
        if(cssFile!=null) {
            String css = Objects.requireNonNull(this.getClass().getResource(cssFile)).toExternalForm();
            scene.getStylesheets().add(css);
        }
        stage.setTitle(title);
        stage.setScene(scene);
        stage.getIcons().add(new Image("ico.png"));
        stage.setResizable(false);
        stage.show();
    }

}
