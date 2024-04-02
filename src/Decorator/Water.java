package Decorator;

public class Water implements Alcohol {
    private Alcohol alcohol;
    public Water(Alcohol alcohol)
    {
        this.alcohol=alcohol;
    }

    @Override
    public String description() {
        return alcohol.description()+", WATER";
    }

    @Override
    public int cost() {
        return alcohol.cost()+10;
    }
}
