package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ChooseStrategy strategy=new ChooseStrategy(new LoopStrategy());
        int[] arr={2,3,4,5,6,1,2,32,23};
        System.out.println("USING LOOP :"+strategy.perform(arr));
        strategy.setStrategy(new SortStrategy());
        System.out.println("USING STREAMS :"+strategy.perform(arr));
    }
}
