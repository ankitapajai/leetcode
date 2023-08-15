package com.bootcoding.leetcode.Leetcode;

public class PostOrderTraverse {
   public void PostOrder(TreeNode root){
       if(root == null){
           return;
       }
       else{
           PostOrder(root.left);
           PostOrder(root.right);
           System.out.println(root.data);
       }
   }

}
