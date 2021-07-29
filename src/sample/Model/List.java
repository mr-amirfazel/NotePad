package sample.Model;

import java.util.ArrayList;

public class List {
    private ArrayList<Note> notes;

    public List() {
        notes = new ArrayList<>();
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }
}
