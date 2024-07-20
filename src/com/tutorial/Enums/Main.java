package src.com.tutorial.Enums;

public class Main {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        // enum constant
        // They are public static and finals
        // The type is Week

    }

    public Main() {

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        for (Week day : Week.values()) {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
