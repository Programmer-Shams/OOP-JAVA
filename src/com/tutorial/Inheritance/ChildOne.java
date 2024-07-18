package src.com.tutorial.Inheritance;

// so now i want to create a child that will also have houses, money , and cars so we can use the extends keyword
public class ChildOne extends  Parent {

    int NumberOfBus;
    // we can get the father's house
    // let craete a constructor to do that

    public ChildOne() {
        NumberOfBus = 40;
    }

    public ChildOne(int numberOfHouse, int money, int numberOfCar, int numberOfBus) {
        super(numberOfHouse, money, numberOfCar); // getting dad's property
        this.NumberOfBus = numberOfBus; // then adding mine
    }
}
