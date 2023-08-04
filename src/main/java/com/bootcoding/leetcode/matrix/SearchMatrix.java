package com.bootcoding.leetcode.matrix;

public class SearchMatrix {
   //WAP to serach the element and print the matrix...
   public static void main(String[] args) {
       // Step 1: Define the matrix dimensions
       int rows = 3;
       int columns = 3;
       int target = 5;
       // Step 2: Declare and initialize the 2-dimensional array
       int[][] matrix = new int[rows][columns];

       // Step 3: Accessing elements and filling the matrix
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               matrix[i][j] = i * columns + j + 1;
           }
       }

       // Step 4: Printing the matrix
       System.out.println("Matrix:");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               System.out.print(matrix[i][j] + " ");
           }
           System.out.println();
       }
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               if (matrix[i][j] == target){
                   System.out.print(i + " " + j);
                   break;
               }
           }
       }
   }
}
