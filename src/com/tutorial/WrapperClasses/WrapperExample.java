package src.com.tutorial.WrapperClasses;

import java.util.ArrayList;

// Autoboxing and Unboxing
//
//    Autoboxing: Automatic conversion of a primitive type to its corresponding wrapper class.
//    Unboxing: Automatic conversion of a wrapper class to its corresponding primitive type.

// Type Conversion: Methods like parseInt(), valueOf(), toString(), etc., are available for type conversion.

// Common Methods in Wrapper Classes
//
//    valueOf(): Converts a given value to its corresponding wrapper object.
//    parseXxx(): Parses a string to return a primitive type.
//    toString(): Converts the wrapper object to a string representation.
//    compareTo(): Compares two wrapper objects.


public class WrapperExample {
    public static void main(String[] args) {
        // Creating wrapper objects
        Integer intObj = Integer.valueOf(100);
        Double doubleObj = Double.valueOf(3.14);
        Boolean boolObj = Boolean.valueOf(true);

        // Converting wrapper objects to strings
        String intStr = intObj.toString();
        String doubleStr = doubleObj.toString();
        String boolStr = boolObj.toString();

        // Parsing strings to primitives
        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean boolValue = Boolean.parseBoolean(boolStr);

        // Comparing wrapper objects
        Integer anotherIntObj = Integer.valueOf(100);
        System.out.println(intObj.compareTo(anotherIntObj)); // Output: 0 (equal)


        // Type Conversion:
        String str = "123";
        int number = Integer.parseInt(str);


        // Collections Framework
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10); // Autoboxing


    }
}

