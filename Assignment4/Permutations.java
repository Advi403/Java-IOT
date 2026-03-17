
package javaassignment4;

// LeetCode 46 - Permutations
import java.util.*;

public class Permutations {

    static void permute(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> result){

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++){

            if(used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);

            permute(nums, used, temp, result);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args){

        int[] nums = {1,2,3};

        List<List<Integer>> result = new ArrayList<>();

        permute(nums, new boolean[nums.length], new ArrayList<>(), result);

        System.out.println(result);
    }
}