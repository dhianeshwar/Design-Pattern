package Singleton;

public class SingleMain {
    public static void main(String[] args) {
        SingleTonDemo obj1=SingleTonDemo.getInstance();
        SingleTonDemo obj2=SingleTonDemo.getInstance();

        obj1.print();
        obj2.print();

    }
}
