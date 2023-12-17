package org.example.easy.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};

        containsDuplicate(nums1);
        containsDuplicate(nums2);
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> withOutDuplicate = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            withOutDuplicate.add(nums[i]);
        }
        if (!(nums.length == withOutDuplicate.size())) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
