package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        Alcohol alcohol=new Rum();
        System.out.println(alcohol.description()+"----->"+alcohol.cost());

        alcohol=new Coke(alcohol);
        System.out.println(alcohol.description()+"----->"+alcohol.cost());

        alcohol=new Water(alcohol);
        System.out.println(alcohol.description()+"----->"+alcohol.cost());

    }
}
