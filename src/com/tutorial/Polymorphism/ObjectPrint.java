package src.com.tutorial.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint() {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint();
        System.out.println(obj);
    }
}
