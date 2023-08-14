package com.bootcoding.leetcode.Leetcode;
// WAP to sum of left leaves..
              /*
                  3
                 / \
                9   20
                   /  \
                  15   7

    Ans - > Output[24];

               */
//   logic
public class SumOfLeftLeaves_404 {
    public int leftLeaves(TreeNode root){
        if(root == null){
            return 0;
        }
        int sum = 0;
        if(root.left != null && root.left.left == null && root.left.right == null){
            sum = sum + root.left.val;
        }
        sum = sum + leftLeaves(root.left);
        sum = sum + leftLeaves(root.right);
        return sum;
    }
}
