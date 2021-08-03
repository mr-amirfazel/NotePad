package sample.Model;

import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String password;
    private NoteBook noteBook;
    private  String pfpPath;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        noteBook = new NoteBook();
        pfpPath = "pfp.jpg";
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

    public String getPfpPath() {
        return pfpPath;
    }

    public void setPfpPath(String pfpPath) {
        this.pfpPath = pfpPath;
    }
}
