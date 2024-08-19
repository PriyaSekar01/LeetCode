public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String argr[]){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l1;

        LinkedListCycle l = new LinkedListCycle();
        boolean result = l.hasCycle(l1);

        System.out.println("Does the linked list have a cycle? " + result);
    }
}
class ListNodeList{
    int val;
    ListNodeList next;
    public ListNodeList(int val) {
        this.val = val;
        this.next = null;
    }
    public ListNodeList(int val, ListNodeList next) {
        this.val = val;
        this.next = next;
    }
}


