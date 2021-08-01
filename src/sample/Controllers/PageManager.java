package sample.Controllers;


import sample.Model.SharedData;
import sample.Model.WeekDay;

public class PageManager {
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
