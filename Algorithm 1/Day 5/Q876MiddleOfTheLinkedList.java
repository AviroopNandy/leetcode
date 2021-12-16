// Definition for singly-linked list.

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q876MiddleOfTheLinkedList {
  public ListNode middleNode(ListNode head) {
    ListNode slowList = head, fastList = head;
    while (fastList != null && fastList.next != null) {
      slowList = slowList.next;
      fastList = fastList.next.next;
    }
    return slowList;
  }
}