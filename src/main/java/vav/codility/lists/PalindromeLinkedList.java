package vav.codility.lists;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        List<Integer> nums = new ArrayList<>();
        ListNode next = head;
        while (next != null) {
            nums.add(next.val);
            next = next.next;
        }
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            if (arr[left]!= arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
