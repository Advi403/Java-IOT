
package javaassignment2;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Java";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
