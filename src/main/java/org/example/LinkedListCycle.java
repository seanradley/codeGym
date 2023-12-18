package org.example;

import java.util.HashSet;
import java.util.Set;

// Definition for singly-linked list.
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
          next = null;
     }
}
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null)
            return false;

        ListNode node = head;
        Set<ListNode> travelledNodes = new HashSet<ListNode>();
        while (node.next != null) {
            if (travelledNodes.contains(node))
                return true;

            travelledNodes.add(node);
            node = node.next;
        }

        return false;
    }
}
