package src.com.tutorial.Encapsulation;

public class Patient {
    // Private fields
    private String name;
    private int age;

    // Public methods to access and update private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
