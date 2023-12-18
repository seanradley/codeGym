package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    public static final LinkedListCycle LINKED_LIST_CYCLE = new LinkedListCycle();

    @org.junit.jupiter.api.Test
    void noCycle() {
        ListNode head = getListNode();
        assertFalse(LINKED_LIST_CYCLE.hasCycle(head));
    }

    private static ListNode getListNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        return head;
    }

    @org.junit.jupiter.api.Test
    void cycle() {
        ListNode head = getListNode();
        head.next.next.next = head;
        assertTrue(LINKED_LIST_CYCLE.hasCycle(head));
    }

    @Test
    void nullList() {
        assertFalse(LINKED_LIST_CYCLE.hasCycle(null));
    }

}