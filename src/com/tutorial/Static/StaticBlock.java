package src.com.tutorial.Static;
// Static blocks are used for static initializations of a class. This code inside a static block is executed
// only once when the class is first loaded into memory.


// Usage:
//
//    For complex static initializations that require multiple steps.
//    To perform logging or other one-time setup tasks.


public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        System.out.println("In static block");
        b  = a * 5;
    }

    public static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}



 class StaticBlockExample2 {
    static int data;

    static {
        data = 50;
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        System.out.println("Data: " + data);  // Output: Static block executed. Data: 50
    }
}
