package src.com.tutorial.Access;

public class ObjectDemo {
    int num;
    double gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj =  new ObjectDemo(30, 4.9f);
        ObjectDemo obj2 =  new ObjectDemo(10, 4.0f);
        if(obj == obj2){
            System.out.println("Obj is equal than obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("Obj is equal than obj2");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
    }
}
