
package javaassignment4;

// LeetCode 239 - Sliding Window Maximum
import java.util.*;

public class SlidingWindow {

    public static void main(String[] args){

        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        for(int i=0;i<=arr.length-k;i++){

            int max = arr[i];

            for(int j=1;j<k;j++)
                if(arr[i+j] > max)
                    max = arr[i+j];

            System.out.print(max + " ");
        }
    }
}