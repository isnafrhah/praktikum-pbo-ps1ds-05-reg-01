package guided.gd1;

public class Demo {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("superclass :");
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();

        System.out.println("subclass :");
        subclass.x = 1;
        subclass.y = 2;
        subclass.tampilXY();

        subclass.z = 5;
        subclass.jumlahXY();
    }
}