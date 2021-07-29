package sample.Model;



public class NoteBook {
    private List[] lists;

    public NoteBook() {
        lists = new List[7];

    }

    public List[] getLists() {
        return lists;
    }
}
