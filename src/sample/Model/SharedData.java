package sample.Model;

public class SharedData {
    private static SharedData sharedData;

    private SharedData(){}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static SharedData getInstance()
    {
        if(sharedData== null)
            sharedData = new SharedData();
        return sharedData;
    }
    public User user;
    public Note note;
    public WeekDay weekDay;
}
