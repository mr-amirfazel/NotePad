package sample.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class List implements Serializable {
    private final ArrayList<Note> notes;

    public List() {
        notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}
