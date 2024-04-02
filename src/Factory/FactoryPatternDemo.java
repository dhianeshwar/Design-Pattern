package Factory;

 class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm circle");
    }
}
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm triangle");
    }
}
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm square");
    }
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I'm rectangle");
    }
}
public class FactoryPatternDemo  {
     public Shape createShape(String type)
     {
        if(type.equalsIgnoreCase("circle"))
            return new Circle();
         if(type.equalsIgnoreCase("triangle"))
             return new Triangle();
         if(type.equalsIgnoreCase("rectangle"))
             return new Rectangle();
         if(type.equalsIgnoreCase("square"))
             return new Square();
         else
             return null;

     }
}
