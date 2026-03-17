
package javaassignment4;

// LeetCode 78 - Subsets
import java.util.*;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        int total = 1 << n;

        for(int i = 0; i < total; i++){
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0)
                    list.add(nums[j]);
            }

            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        System.out.println(subsets(nums));
    }
}