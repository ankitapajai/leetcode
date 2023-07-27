package com.bootcoding.leetcode.Leetcode;

public class TreeApp {
    public static void main(String[] args) {
        // Creating Node 10 and assigning to Root Node
        TreeNode root = new TreeNode(10);
        // Creating Node 6 and assigning to left Node of Root
        root.left = new TreeNode(6);
        // Creating Node 20 and assigning to right Node of Root
        root.right = new TreeNode(20);
        // Creating Node 3 and assigning to left Node of Root's left Node
        root.left.left = new TreeNode(3);
        // Creating Node 9 and assigning to right Node of Root's left Node
        root.left.right = new TreeNode(9);
        // Creating Node 30 and assigning to right Node of Root's right Node
        root.right.right = new TreeNode(30);

        MaxElement_BinaryTree max = new MaxElement_BinaryTree();
        System.out.println("the maximum elements is: ");
        System.out.println(max.maxElement(root));

        MinElement_BinaryTree min = new MinElement_BinaryTree();
        System.out.println("the minimum elements is: ");
        System.out.println(min.minElement(root));

        System.out.println(" ");

        //inorder program running....
        InOrderTraverse in = new InOrderTraverse();
        System.out.println("Inorder Traversal:");
        in.inorder(root);

        System.out.println(" ");

        //PreOrder program running...
        PreOrderTraverse pre = new PreOrderTraverse();
        System.out.println("PreOrder Traversal: ");
        pre.PreOrder(root);

        System.out.println(" ");

        //PostOrder program running.....
        PostOrderTraverse post = new PostOrderTraverse();
        System.out.println("PostOrder Traversal: ");
        post.PostOrder(root);

        //Searched elements....
        SearchEle_BinaryTree search = new SearchEle_BinaryTree();
        System.out.println("search elements is: ");
        boolean bool = search.searchElement(root,9);
        System.out.println(bool);
    }
}
