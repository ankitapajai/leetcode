package com.bootcoding.leetcode.Leetcode;

public class InOrderTraverse {
    //inorder logic...
    //program call in TreeApp...
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        else{
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
}
