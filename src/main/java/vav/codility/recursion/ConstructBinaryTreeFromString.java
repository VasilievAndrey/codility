package vav.codility.recursion;

public class ConstructBinaryTreeFromString {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode str2tree(String s) {
        if (s == null || s.equals("")) {
            return null;
        }
        if (!s.contains("(")) {
            return new TreeNode(getValue(s,0)[0], null, null);
        }
        return buildNode(s, 0);
    }

    private static TreeNode buildNode(String s, int i) {
        int[] value = getValue(s, i);
        int val = value[0];
        i = value[1];
        if (i < s.length() -1 && s.charAt(i+1) == ')' || i == s.length() -1) {
            return new TreeNode(val, null, null);
        } else if (i < s.length() -1 && s.charAt(i+1) == '(') {
            int rightIndex = findRight(s, i+2);
            if (rightIndex + 1 < s.length()) {
                if (s.charAt(rightIndex +1)== ')') {
                    return new TreeNode(val, buildNode(s, i+2), null);
                } else {
                    return new TreeNode(val, buildNode(s, i + 2), buildNode(s, rightIndex + 2));
                }
            } else if (rightIndex +1 == s.length()) {
                return new TreeNode(val, buildNode(s,i+2), null);
            }
        }
        return null;
    }
    private static int[] getValue(String s, int i) {
        int sign = 1;
        int val = Integer.MAX_VALUE;
        while (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
            } else if (s.charAt(i) != '(' && s.charAt(i) != ')') {
                if (val == Integer.MAX_VALUE ) {
                    val = s.charAt(i) -48;
                } else {
                    val = val * 10 + s.charAt(i) -48;
                }
            } else {
                i--;
                break;
            }
            i++;
        }
        return new int[] {val * sign, i};
    }
    private static int findRight(String s, int i) {
        int count = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                if (count == 0) {
                    return i;
                } else {
                    count--;
                }
            }
            i++;
        }
        throw new IllegalArgumentException("Not valid graph");
    }
}
