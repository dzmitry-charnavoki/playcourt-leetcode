package problems.p0200_0300.p0297_serialize_and_deserialize_binary_tree;


import letcode.TreeNode;

class Codec {
    private static final String DELIMETER = ",";
    private static final String N = "N";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        preorderSer(root, sb);
        return sb.toString();
    }

    // dfs
    private void preorderSer(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(N).append(DELIMETER);
            return;
        }
        sb.append(node.val).append(DELIMETER);
        preorderSer(node.left, sb);
        preorderSer(node.right, sb);
    }

    private int index = 0;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        final String[] vals = data.split(DELIMETER);
        return preorderDsr(vals);
    }

    private TreeNode preorderDsr(String[] vals) {
        if (vals[index].equals(N)) {
            index++;
            return null;
        }
        TreeNode node = new TreeNode(Integer.parseInt(vals[index++]));
        node.left = preorderDsr(vals);
        node.right = preorderDsr(vals);
        return node;
    }

}
