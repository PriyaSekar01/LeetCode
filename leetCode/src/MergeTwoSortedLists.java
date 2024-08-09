public class MergeTwoSortedLists {

    public ListNodeClass mergeTwoLists(ListNodeClass list1, ListNodeClass list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNodeClass current = null;
        ListNodeClass result = null;

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

    public static void printList(ListNodeClass node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ListNodeClass l1 = new ListNodeClass(2);
        l1.next = new ListNodeClass(4);
        l1.next.next = new ListNodeClass(3);

        ListNodeClass l2 = new ListNodeClass(5);
        l2.next = new ListNodeClass(6);
        l2.next.next = new ListNodeClass(4);

        MergeTwoSortedLists m = new MergeTwoSortedLists();
        ListNodeClass result = m.mergeTwoLists(l1, l2);

        // Print the merged list
        printList(result);
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



