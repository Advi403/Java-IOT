
package javaassignment4;

// LeetCode 22 - Generate Parentheses
import java.util.*;

public class GenerateParentheses {

    static void generate(int open, int close, String str, List<String> result){

        if(open == 0 && close == 0){
            result.add(str);
            return;
        }

        if(open > 0)
            generate(open-1, close+1, str+"(", result);

        if(close > 0)
            generate(open, close-1, str+")", result);
    }

    public static void main(String[] args){

        int n = 3;

        List<String> result = new ArrayList<>();

        generate(n,0,"",result);

        System.out.println(result);
    }
}