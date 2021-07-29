package sample.Model;



public class NoteBook {
    private List[] lists;

    public NoteBook() {
        lists = new List[7];
        initList();

    }
    private void initList()
    {
        for (int i = 0; i <7 ; i++) {
            lists[i] = new List();
        }
    }

    public List[] getLists() {
        return lists;
    }
}
