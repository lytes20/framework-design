public class Counter {
    private int value = 0;

    public int getValue() {
        return value;
    }

    public int increment(){
        return ++value;
    }

    public int decrement(){
        return --value;
    }
}
