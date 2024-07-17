package src.com.tutorial;
import static src.com.tutorial.Message.message;

public class Greetings {
    public static void main(String[] args) {
       GoodMoring moring = new GoodMoring();
       moring.greet();
       message();
    }
}

class GoodMoring {
    void greet() {
        System.out.println("Good morining");
    }
}
