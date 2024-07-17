package src.com.tutorial.Static;

// Static nested classes (also called static inner classes) are nested classes marked with the static keyword.

// Usage:
//
//    When a nested class does not require access to the outer class’s instance members.
//    To group classes that will be used only in one place, improving encapsulation and readability.



public class StaticClasses {
        static class NestedStaticClass {
            void display() {
                System.out.println("Static nested class method.");
            }
        }

        public static void main(String[] args) {
            StaticClasses.NestedStaticClass nestedObject = new StaticClasses.NestedStaticClass();
            nestedObject.display();  // Output: Static nested class method.
        }
}
