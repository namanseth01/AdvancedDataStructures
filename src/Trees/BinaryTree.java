package Trees;

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
}
