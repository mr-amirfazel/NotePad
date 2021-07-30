package sample.Controllers;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import sample.Model.SharedData;
import sample.Model.WeekDay;

public class PageManager {
    private WeekDay weekDay;
    private SceneLoader sceneLoader = new SceneLoader();

    public void goToDay(Pane pane)
    {
        weekDay = SharedData.getInstance().weekDay;
        switch (weekDay)
        {
            case MONDAY -> {
                sceneLoader.goToMonday(pane);
                break;
            }
        }
    }

}
