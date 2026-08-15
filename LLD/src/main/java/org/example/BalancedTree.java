package org.example;

import com.sun.source.tree.Tree;

public class BalancedTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
                root.left = new TreeNode(20);
                root.right = new TreeNode(30);
                root.left.left = new TreeNode(40);
                root.left.right = new TreeNode(50);
                System.out.println(isBalanced(root));
    }

    static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        if(Math.abs(lHeight - rHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);

    }

    public static int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
