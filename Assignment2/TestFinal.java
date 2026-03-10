
package javaassignment2;

class FinalDemo {
    final int number = 10;  

    final void show() {    
        System.out.println("Final method");
    }
}

final class FinalClass {    
    void display() {
        System.out.println("Final class example");
    }
}

public class TestFinal {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println("Final Variable: " + obj.number);

        FinalClass fc = new FinalClass();
        fc.display();
    }
}