package Trees;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        TreeNode left;
        TreeNode right;
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
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
        System.out.println("Binary tree created......");
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " -> ");
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        System.out.print(root.data + " -> ");
        postOrder(root.right);
    }

    public void preOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " -> ");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println("------------------------------");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.println("------------------------------");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("-------------------------------");
        bt.preOrder1(bt.root);
    }
}
