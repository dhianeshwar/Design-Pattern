package Singleton;

public class SingleTonDemo {
    private static SingleTonDemo instance;
    SingleTonDemo()
    {
        System.out.println("In a private Constructor");
    }

    public static SingleTonDemo getInstance()
    {
        if(instance==null)
        {
            instance=new SingleTonDemo();
        }
        return instance;
    }
    public void print()
    {
        System.out.println("Print ");
    }
}
