package src.com.tutorial.Abstraction;

public class Child extends Parent {
    public Child(int age) {
        super(age);
    }

    @Override
    void partner() {
        System.out.println("I love shams ");
    }

    @Override
    void career() {
        System.out.println("I love money");
    }
}
