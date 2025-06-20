package Week1.DesignPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        shape1.draw();  

        Shape shape2 = factory.getShape("rectangle");
        shape2.draw();  
    }
}
