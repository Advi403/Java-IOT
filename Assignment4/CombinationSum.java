
package javaassignment4;

// LeetCode 39 - Combination Sum
import java.util.*;

public class CombinationSum {

    static void find(int[] arr, int target, int start, List<Integer> temp, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < arr.length; i++){

            if(arr[i] > target) continue;

            temp.add(arr[i]);

            find(arr, target - arr[i], i, temp, result);

            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args){

        int[] arr = {2,3,6,7};
        int target = 7;

        List<List<Integer>> result = new ArrayList<>();

        find(arr, target, 0, new ArrayList<>(), result);

        System.out.println(result);
    }
}