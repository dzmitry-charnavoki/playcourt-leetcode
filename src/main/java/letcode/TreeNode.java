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
     * bfs approach with preorder
     *
     * @param treeValues array of int as representation of Tree
     * @return TreeNode obj
     */
    public static TreeNode of(Integer... treeValues) {
        if (treeValues == null
            || treeValues.length == 0
            || treeValues[0] == null) {
            return null;
        }
        TreeNode head = new TreeNode(treeValues[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        int i = 0;
        while (!queue.isEmpty()) {
            TreeNode tail = queue.poll();
            if (++i < treeValues.length && treeValues[i] != null) {
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
        StringBuilder sb = new StringBuilder("[");
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(this);

        while (!nodeQueue.isEmpty()) {
            TreeNode currentNode = nodeQueue.poll();

            if (currentNode != null) {
                sb.append(currentNode.val).append(", ");
                if (currentNode.left != null || currentNode.right != null) {
                    nodeQueue.offer(currentNode.left);
                    nodeQueue.offer(currentNode.right);
                }
            } else {
                sb.append("null, ");
            }
        }

        // Remove the last comma and space
        sb.setLength(sb.length() - 2);
        sb.append("]");

        return sb.toString();
    }

}
