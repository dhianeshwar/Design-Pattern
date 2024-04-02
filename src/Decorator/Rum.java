package Decorator;

public class Rum implements Alcohol{

    @Override
    public String description() {
        return "RUM";
    }

    @Override
    public int cost() {
        return 240;
    }
}
