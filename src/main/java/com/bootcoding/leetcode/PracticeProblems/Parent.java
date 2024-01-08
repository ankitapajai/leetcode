package com.bootcoding.leetcode.PracticeProblems;

class Parent {
    //constructor
    Parent(){
        System.out.println("Parent constructor: ");
    }

    //final method
    final void finalMethod(){
        System.out.println("final method in parent class: ");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("child constructor: ");
    }
}

class Main{
    public static void main(String[] args) {
        Child child = new Child();
        child.finalMethod();
    }
}
