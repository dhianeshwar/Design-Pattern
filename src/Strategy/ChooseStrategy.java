package Strategy;

public class ChooseStrategy {
    private FindStrategy strategy;
    public ChooseStrategy(FindStrategy strategy)
    {
        this.strategy=strategy;
    }
    public void setStrategy(FindStrategy strategy)
    {
        this.strategy=strategy;
    }
    public int perform(int arr[])
    {
        return strategy.largest(arr);
    }
}
