package Decorator;

public class Coke implements Alcohol{
    private Alcohol alcohol;
    public Coke(Alcohol alcohol)
    {
        this.alcohol=alcohol;
    }
    @Override
    public String description() {
        return alcohol.description()+", COKE";
    }

    @Override
    public int cost() {
        return alcohol.cost()+50;
    }
}
