package org.example.AddTwoNumbers;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int i1 = convertToInt(l1);
        int i2 = convertToInt(l2);

        int answerInt = i1 + i2;
        return convertToLinkedList(answerInt);
    }

     static ListNode convertToLinkedList(int integer) {
        ListNode head = null;
        ListNode node = null;
        while (integer != 0) {
            if (node == null) {
                node = new ListNode(integer%10);
                head = node;
            } else {
                node.next = new ListNode(integer%10);
                node = node.next;
            }
            integer = integer/10;
        }

        return head;
    }

     static int convertToInt(ListNode l1) {
        int answer = 0;
        int multiplier = 1;
        while (l1 != null) {
            answer = answer + l1.val*multiplier;
            l1 = l1.next;
            multiplier = multiplier*10;
        }
        return answer;
    }
}
