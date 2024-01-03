package com.bootcoding.leetcode.Leetcode;

public class MinElement_BinaryTree {
    //WAP a program to find minimum elements of a binary tree....
    public int minElement(TreeNode root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int min = root.data;
        int leftVal = minElement(root.left);
        int rightVal = minElement(root.right);
        if(leftVal < min){
            min = leftVal;
        }
        else if(rightVal < min){
            min = rightVal;
        }
        return min;
    }
}
