package src.com.tutorial.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes square = new Square();
        Shapes circle = new Circle();

        circle.area();
    }

}
