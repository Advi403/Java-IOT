
package javaassignment1;


public class Methodoverloading {
    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }

    public static void main(String[] args) {
        Methodoverloading obj = new Methodoverloading();
        obj.add(5, 3);
        obj.add(2.5, 4.5);
    }
}
    


    

