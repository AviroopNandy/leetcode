class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Q19RemoveNthNodeFromEndOfList {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode current = head;
    int count = 0;
    while(current != null) {
      count++;
      current = current.next;
    }
    int indexToDelete = count - n + 1;
    ListNode temp = head, prev = null;
    if(indexToDelete == 1) {
      head = temp.next;
      return head;
    }
    for(int i = 1; i < indexToDelete; i++) {
      prev = temp;
      temp = temp.next;
    }
    prev.next = temp.next;
    return head;
  }
}