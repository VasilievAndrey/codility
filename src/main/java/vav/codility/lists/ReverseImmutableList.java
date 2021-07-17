package vav.codility.lists;

public class ReverseImmutableList {

    public void printLinkedListInReverse(ImmutableListNode head) {
         ImmutableListNode next = head;
         ListNode res = new ListNode(head, null);
         while(next !=null) {
             ImmutableListNode nextImm = next.getNext();
             res = new ListNode(nextImm, res);
             next = nextImm;
         }
         while (res !=null) {
             if (res.cur != null) {
                 res.cur.printValue();
             }
             res = res.parent;
         }
    }

    public static class ListNode {
        ImmutableListNode cur;
        ListNode parent;

        public ListNode(ImmutableListNode cur, ListNode parent) {
            this.cur = cur;
            this.parent = parent;
        }
    }

    public interface ImmutableListNode {
       void printValue(); // print the value of this node.
       ImmutableListNode getNext(); // return the next node.
  };
    public static class CustListNode implements ImmutableListNode {

        @Override
        public void printValue() {

        }

        @Override
        public ImmutableListNode getNext() {
            return null;
        }
    }
}
