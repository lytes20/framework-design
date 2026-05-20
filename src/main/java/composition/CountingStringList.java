package composition;

public class CountingStringList {
    private int count;
    StringList list = new StringList();

    public int getCount() {
        return count;
    }

    public  void add(String theString){
        count++;
        list.add(theString);
    }

    public void addAll(String[] theStrings, int size){
        count=count+size;
        list.addAll(theStrings, size);
    }

    public void showList(){
        list.showList();
    }
}
