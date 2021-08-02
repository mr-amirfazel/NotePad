package sample.Model;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private NoteBook noteBook;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        noteBook = new NoteBook();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public NoteBook getNoteBook() {
        return noteBook;
    }
}
