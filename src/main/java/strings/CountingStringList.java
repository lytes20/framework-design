package strings;

public class CountingStringList extends StringList {
    private int count;

    public int getCount() {
        return count;
    }

    @Override
    public  void add(String theString){
        count++;
        super.add(theString);
    }

    @Override
    public void addAll(String[] theStrings, int size){
        count=count+size;
        super.addAll(theStrings, size);
    }
}
