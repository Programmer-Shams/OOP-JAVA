package src.com.tutorial.Inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Father's Houses" + " = " + parent.NumberOfHouse);
        System.out.println("Father's Money" + " = " +  parent.Money);
        System.out.println("Father's Cars" + " = " + parent.NumberOfCar);


        // so now i want to create a child that will also have houses, money , and cars
        ChildOne childOne = new ChildOne();
        System.out.println("ChildOne's Houses" + " = " + childOne.NumberOfHouse);
        System.out.println("ChildOne's Houses" + " = " + childOne.Money);
        System.out.println("ChildOne's Houses" + " = " + childOne.NumberOfCar);
        System.out.println("ChildOne's Houses" + " = " + childOne.NumberOfBus);
    }
}
