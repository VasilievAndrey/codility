package vav.codility.arrays2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSmaller {

    public List<Integer> countSmaller(int[] nums) {
        int offset = 10000; // offset negative to non-negative
        int size = 2 * 10000 + 1; // total possible values in nums
        int[] tree = new int[size * 2];
        List<Integer> result = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int count = query(0, nums[i] + offset, tree, size);
            result.add(count);
            update(nums[i] + offset, 1, tree, size);
        }
        Collections.reverse(result);
        return result;
    }

    private void update(int ind, int value, int[] tree, int size) {
        ind += size; // shift the ind to the leaf
        // update from leaf to root
        tree[ind] += value;
        while (ind > 1) {
            ind /= 2;
            tree[ind] = tree[ind * 2] + tree[ind * 2 + 1];
        }
    }

    private int query(int left, int right, int[] tree, int size) {
        // return sum of [left, right)
        int result = 0;
        left += size; // shift the index to the leaf
        right += size;
        while (left < right) {
            // if left is a right node
            // bring the value and move to parent's right node
            if (left % 2 == 1) {
                result += tree[left];
                left++;
            }
            // else directly move to parent
            left /= 2;
            // if right is a right node
            // bring the value of the left node and move to parent
            if (right % 2 == 1) {
                right--;
                result += tree[right];
            }
            // else directly move to parent
            right /= 2;
        }
        return result;
    }
}
