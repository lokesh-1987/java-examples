package com.java.examples;

public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

//        System.out.println("listNode :");
//        while (head != null) {
//            System.out.println(head.val);
//            head = head.next;
//        }

        ListNode reverseListNode = reverseList(head);

        System.out.println("reverseListNode :");
        while (reverseListNode != null) {
            System.out.println(reverseListNode.val);
            reverseListNode = reverseListNode.next;
        }

    }

    public static ListNode reverseListUsingTemp(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        return head;
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
