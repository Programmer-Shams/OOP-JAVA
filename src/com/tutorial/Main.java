package src.com.tutorial;

public class Main {
    public static void main(String[] args) {
        // to craete the object

//        src.com.tutorial.Student student1 = new src.com.tutorial.Student();
//        student1.name = "John Doe";
//        student1.rollno = 1;
//        student1.marks = 80;

//        System.out.println(student1.name);
//        System.out.println(student1.rollno);
//        System.out.println(student1.marks);



        // caling the object with the constructor
        Student student1 = new Student(10, "shamsudeen", 85.6f);
        student1.displayData();

        Student student2 = new Student(20, "Imran", 95.1f);
        student2.displayData();

        Student student3 = new Student(30, "Jamiu", 75.4f);
        student3.displayData();

        Student DefaultStudent = new Student();
        DefaultStudent.displayData();
    }

}


class Student {
    int rollno;
    String name;
    float marks;

    // creating a constructor
    // this is a default constructor when you call the class which will create a class with this default data.
    Student () {
        this.rollno = 0;
        this.name = "Default Name";
        this.marks = 100;
    }

    // constructor with passing
    Student (int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }


    // src.com.tutorial.A function to display
    void displayData() {
        System.out.println("My name is " + this.name + " and I am Roll Number" + this.rollno + " My mark is " + this.marks);
    }


    // Garbage collector
//    for(int i = 0; i < 100; i ++) {
//        src.com.tutorial.A obj = new src.com.tutorial.A();
//    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object destroyed");
    }
}

class A  {
    public A() {
       final  int number = 10;
       String woord = "shams";
    }
}
