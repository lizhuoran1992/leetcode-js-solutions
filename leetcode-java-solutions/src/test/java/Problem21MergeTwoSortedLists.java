import org.junit.Test;

public class Problem21MergeTwoSortedLists {
    @Test
    public void test() {
        ListNode l1;
//        mergeTwoLists();
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }

            temp = temp.next;
        }

        if (l2 == null) {
            temp.next = l1;
        }

        if (l1 == null) {
            temp.next = l2;
        }

        return result.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
