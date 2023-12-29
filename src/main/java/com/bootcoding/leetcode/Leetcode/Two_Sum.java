package com.bootcoding.leetcode.Leetcode;

public class Two_Sum {
    public static void main(String[] args) {
        Two_Sum ts = new Two_Sum();
        int[] nums = {1,2,3,4,5};
        int target = 3;
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
