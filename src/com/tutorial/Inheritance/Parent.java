package src.com.tutorial.Inheritance;

public class Parent {
     int NumberOfHouse;
     int Money;
     int NumberOfCar;

     // default constructor
    public Parent() {
        this.NumberOfHouse = 10;
        this.Money = 10000;
        this.NumberOfCar = 5;
    }

    // constructor
    public Parent(int numberOfHouse, int money, int numberOfCar) {
        this.NumberOfHouse = numberOfHouse;
        this.Money = money;
        this.NumberOfCar = numberOfCar;
    }

    // getFatherProperty
    public void  getFatherProperty () {
        System.out.println("Displaying Father Property");
    }
}
