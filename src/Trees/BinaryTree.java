package Trees;

import com.sun.source.tree.Tree;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private Trees.TreeNode left;
        private Trees.TreeNode right;
        private int data;


        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
    }
}
