
package javaassignment2;

public class StringDemo {
    public static void main(String[] args) {

        
        String str = "Hello";
        str = str + " World";
        System.out.println("String: " + str);

        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}