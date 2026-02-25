
package javaprograms;

class Demo {
    void show(int a) {
        System.out.println("Overloading: " + a);
    }

    void show(int a, int b) {
        System.out.println("Overloading: " + (a + b));
    }
}

class DemoChild extends Demo {
    void show(int a) {
        System.out.println("Overriding: " + a);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        DemoChild obj = new DemoChild();
        obj.show(5);
        obj.show(3, 4);
    }
}
   
