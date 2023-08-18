package com.bootcoding.leetcode.Leetcode.RangeSumOfBST;

    //WAP to find the range elements of BST and Sum of these elements..
                 /*
                    10
                   /  \
                  5   15
                 / \    \
                3   7    18
                            */
    //Input: root = [10,5,15,3,7,null,18], low = 7, high = 15..
    //Output: 32
    //Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.

    class TreeNode1{
        int val;
        TreeNode1 left;
        TreeNode1 right;

        public TreeNode1(int val){
            this.val = val;
        }

    }

    public class RangeSumOfBST_938 {
        public static int rangeSumBST(TreeNode1 root, int low, int high){
            if(root == null){
                return 0;
            }

            if(root.val < low){
                return rangeSumBST(root.right, low, high);
            }else if(root.val > high){
                return rangeSumBST(root.left, low, high);
            }
            return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        }

        public static void main(String[] args) {
            //create object..
            TreeNode1 root = new TreeNode1(10);
            root.left = new TreeNode1(5);
            root.right = new TreeNode1(15);
            root.left.left = new TreeNode1(3);
            root.left.right = new TreeNode1(7);
            root.right.right = new TreeNode1(18);

            int low = 7;
            int high = 15;


            int result = rangeSumBST(root, low, high);
            System.out.println("Sum of numbers within the range: [" + low + "," + high + "]: " + result);
        }

    }


