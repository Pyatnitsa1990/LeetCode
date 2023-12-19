package org.example.easy.twosum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(target - nums[i])) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        System.out.println(Arrays.toString(new int[]{nums[j], nums[i]}));
                        return new int[]{j, i};
                    }
                }
            }
            numbers.add(nums[i]);
        }
        return nums;
    }
}
