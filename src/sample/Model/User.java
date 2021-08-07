package sample.Model;

import java.io.Serializable;
import java.time.LocalDate;


public class User implements Serializable {
    private final String username;
    private String password;
    private final NoteBook noteBook;
    private  String pfpPath;
    private String name;
    private LocalDate birthDate;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        noteBook = new NoteBook();
        pfpPath = "pfp.jpg";
        name ="name";
        birthDate = LocalDate.of(2000,1,1) ;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
