package src.com.tutorial.Static;

public class StaticVariables {
    public static int count = 0;

//    public Counter() {
//        count++;
//    }

    public static void main(String[] args) {
        StaticVariables obj1 = new StaticVariables();
        StaticVariables obj2 = new StaticVariables();
        StaticVariables obj3 = new StaticVariables();
        System.out.println("Count is: " + StaticVariables.count);  // Output: Count is: 3
    }
}
