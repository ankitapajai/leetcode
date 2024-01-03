package com.bootcoding.leetcode.Leetcode;

public class MaxElement_BinaryTree {
    //WAP a program to find maximum elements in a binary tree.....
    public int maxElement(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int max = root.data;
        int leftVal = maxElement(root.left);
        int rightVal =  maxElement(root.right);
        if(leftVal > max){
            max = leftVal;
        }
        else if(rightVal > max){
            max = rightVal;
        }
        return max;
    }
}
