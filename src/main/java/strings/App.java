package strings;

public class App {

    public static void main(String[] args) {
        CountingStringList list = new CountingStringList();
        String s = "Mango";
        list.add(s);
        String s2 = "Apple";
        list.add(s2);

        String[] fruits = {"Banana", "Orange"};

        list.addAll(fruits, 2);
        list.showList();
        System.out.println(list.getCount());
    }
}
