package sample.Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Note implements Serializable {
    private final String note;
    private boolean isChecked;
    private boolean isStarred;
    private final LocalDate publishDate;
    private final String title;

    public Note(String note, String title) {
        this.note = note;
        this.title = title;
        isChecked = false;
        isStarred = false;
        publishDate = java.time.LocalDate.now();
    }

    public String getNote() {
        return note;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public boolean isStarred() {
        return isStarred;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public void setStarred(boolean starred) {
        isStarred = starred;
    }
}
