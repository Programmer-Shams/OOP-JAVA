package src.com.tutorial.Static;

public class MathUtils {

    // make all the method static
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
//        MathUtils mathUtils = new MathUtils(); // we dont need to create an object of the class , we can just make the method static and then we can use without creating the instance of the class
//        mathUtils.add(1, 3);

        // so we do this
        // we can do this because the method is now static
        System.out.println(MathUtils.add(2, 5));
        System.out.println(MathUtils.subtract(2, 5));
        System.out.println(MathUtils.multiply(2, 5));
        System.out.println(MathUtils.divide(2, 5));
    }
}
