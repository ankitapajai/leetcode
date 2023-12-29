package com.bootcoding.leetcode;

public class Array {
    //remove duplicate from sorted array...
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Array array = new Array();
        int[] result = {1,1,2,3,4,4,5,6};
       // result = array.removeDuplicates(int[] result);
        System.out.println(result);
    }
}
