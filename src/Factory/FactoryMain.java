package Factory;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryPatternDemo obj=new FactoryPatternDemo();
        Shape circle=obj.createShape("circle");
        Shape square=obj.createShape("SQUARE");

        circle.draw();
        square.draw();
    }

}
