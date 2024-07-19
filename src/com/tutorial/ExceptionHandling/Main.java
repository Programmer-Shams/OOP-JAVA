package src.com.tutorial.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            b = a / b;
            divide(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("will always run");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Don't Divide by zero");
        }
        return a / b;
    }
}
