
package javaassignment2;

class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        StaticDemo.displayCount();
    }
}
