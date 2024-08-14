public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode current = null;
        ListNode result = null;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                if (current == null) {
                    current = list1;
                    result = current;
                } else {
                    current.next = list1;
                    current = current.next;
                }
                list1 = list1.next;
            } else {
                if (current == null) {
                    current = list2;
                    result = current;
                } else {
                    current.next = list2;
                    current = current.next;
                }
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            current.next = list1;
            current = current.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            current.next = list2;
            current = current.next;
            list2 = list2.next;
        }

        return result;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the first linked list: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Create the second linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        // Merge the two linked lists
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged linked list
        printList(mergedList);
    }
}

class ListNodeClass {
    int val;
    ListNodeClass next;

    public ListNodeClass(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNodeClass(int val, ListNodeClass next) {
        this.val = val;
        this.next = next;
    }
}



