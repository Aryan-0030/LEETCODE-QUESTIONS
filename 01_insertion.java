class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0); // dummy node before sorted list
        ListNode curr = head;

        while (curr != null) {
            ListNode prev = dummy;

            // find position to insert current node
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
                
            }

            ListNode nextTemp = curr.next; // save next

            // detach curr before inserting
            curr.next = prev.next;
            prev.next = curr;

            // move on
            curr = nextTemp;
        }
        return dummy.next;
    }
}
