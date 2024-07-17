package src.com.tutorial.Static;

public class Main {
    public static void main(String[] args) {
        Human shams = new Human(19, "Shamsudeen", 10000, false);
        Human imran = new Human(20, "Imran", 20000, true);

        System.out.println(Human.population);

    }
    static void run() {
//        greeting(); // static data can also only access static data.
    }
    void  greeting() { // this has to be static
        System.out.println("Hello World!");
        run();
    }
}
