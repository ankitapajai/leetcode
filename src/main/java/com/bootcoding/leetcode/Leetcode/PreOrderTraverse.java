package com.bootcoding.leetcode.Leetcode;

public class PreOrderTraverse {
    public void PreOrder(TreeNode root){
        if(root == null){
            return;
        }
        else{
            System.out.println(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
        }
    }

}
