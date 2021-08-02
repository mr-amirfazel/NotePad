package sample.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import sample.Model.FileUtils;
import sample.Model.Note;
import sample.Model.SharedData;
import sample.Model.WeekDay;

public class NoteCompose {

    @FXML
    private AnchorPane noteCompose;

    @FXML
    private TextField titleField;
    @FXML
    private TextArea noteField;

    @FXML
    void goToDay(MouseEvent event) {
        new SceneLoader().goToDayList(noteCompose);
    }

    @FXML
    void saveNote(MouseEvent event) {
        int i =getIndex();
        SharedData.getInstance().user.getNoteBook().getLists()[i].getNotes().add(new Note(noteField.getText(),titleField.getText()));
        new FileUtils().savePlayer(SharedData.getInstance().user);
    }

    int getIndex()
    {
        int i =0;
        WeekDay weekDay = SharedData.getInstance().weekDay;
        if(weekDay == WeekDay.MONDAY)
            i = 0;
        else if(weekDay == WeekDay.TUESDAY)
            i=1;
        else if(weekDay==WeekDay.WEDNESDAY)
            i =2;
        else if(weekDay==WeekDay.THURSDAY)
            i =3;
        else if(weekDay==WeekDay.FRIDAY)
            i =4;
        else if(weekDay==WeekDay.SATURDAY)
            i =5;
        else if(weekDay==WeekDay.SUNDAY)
            i =6;

       return i;
    }

}
