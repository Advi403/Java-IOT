
package javaassignment2;

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class AgeCheck {
    static void validate(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
