package com.bootcoding.leetcode.LinkedList;

import java.util.List;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode current = head;

        while(current != null){
            ListNode nextTemp = current.next;
            current.next = pre;
            pre = current;
            current = nextTemp;
        }
        return pre;
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.println(" " +current.val);
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        System.out.println("original linked list: ");
        printList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed linked list:");
        printList(reversedHead);


    }

}
