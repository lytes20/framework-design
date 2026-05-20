package composition;

import java.util.ArrayList;

public class StringList {
    private ArrayList<String> theList = new ArrayList<>();

    public void add(String theString){
        theList.add(theString);
    }
    public void addAll(String theStrings[], int size){
        for(int i = 0; i < size; i++){
            add(theStrings[i]);
        }
    }

    public void showList(){
        System.out.println(theList);
    }

}
