package letcode;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * Helper method to generate TreeNode of nodes from given numbers.
     * 1, null, 2, 3
     * root l   r  l
     *
     * @param treeValues array of int as representation of Tree
     * @return TreeNode obj
     */
    public static TreeNode of(Integer... treeValues) {
        if (treeValues == null || treeValues.length == 0 || treeValues[0] == null) {
            return null;
        }
        TreeNode head = new TreeNode(treeValues[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        for (int i = 1; i < treeValues.length; i++) {
            TreeNode tail = queue.poll();
            if (treeValues[i] != null) {
                tail.left = new TreeNode(treeValues[i]);
                queue.offer(tail.left);
            }
            if (++i < treeValues.length && treeValues[i] != null) {
                tail.right = new TreeNode(treeValues[i]);
                queue.offer(tail.right);
            }
        }
        return head;
    }

    public String toString() {
        if (left == null && right == null) {
            return "" + val;
        } else {
            String root = "" + val;
            String leftValue = "null";
            String rightValue = "null";
            if (left != null) {
                leftValue = left.toString();
            }
            if (right != null) {
                rightValue = right.toString();
            }
            return root + ", " + leftValue + ", " + rightValue;
        }
    }

}
