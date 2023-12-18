package org.example.AddTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    public static final AddTwoNumbers ADD_TWO_NUMBERS = new AddTwoNumbers();

    private static ListNode getListNode(int[] valArr) {
        ListNode head = null;
        ListNode node = null;
        for (int i : valArr) {
            if (node == null) {
                node = new ListNode(i);
                head = node;
            } else {
                node.next = new ListNode(i);
                node = node.next;
            }
        }
        return head;
    }

    @Test
    void add3DigitNumbers() {
        ListNode l1 = getListNode(new int[] {3, 2, 1});
        ListNode l2 = getListNode(new int[] {6, 5, 4});
        ListNode listNode = ADD_TWO_NUMBERS.addTwoNumbers(l1, l2);

        assertEquals(9, listNode.val);
        assertEquals(7, listNode.next.val);
        assertEquals(5, listNode.next.next.val);
    }

    @Test
    void MulitpleDigits() {
        ListNode l1 = getListNode(new int[] {3, 2, 1, 3});
        ListNode l2 = getListNode(new int[] {6, 5, 4, 6});
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);

        assertEquals(9, listNode.val);
        assertEquals(7, listNode.next.val);
        assertEquals(5, listNode.next.next.val);
        assertEquals(9, listNode.next.next.next.val);

    }

    @Test
    void addZeros() {
        
    }

    @Test
    void convertToLinkedList() {
        ListNode listNode = AddTwoNumbers.convertToLinkedList(1234);
        assertEquals(4, listNode.val);
        assertEquals(3, listNode.next.val);
        assertEquals(2, listNode.next.next.val);
        assertEquals(1, listNode.next.next.next.val);
    }

    @Test
    void convertToInt() {
        ListNode listNode = getListNode(new int[]{3, 2, 1, 3});
        assertEquals(3123, AddTwoNumbers.convertToInt(listNode));
    }
}