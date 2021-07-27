package sample.Model;

public class User {
    private String username;
    private String password;
    private NoteBook noteBook;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
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
