package com.test.tree;

public class DepthOfTree {

	public int minimumDepth(Node<Integer> root) {

		// System.out.println(root.getData());
		// corner case
		if (root == null) {
			return 0;
		}
		// base case
		if (root.getLeft() == null && root.getRight() == null) {
			return 1;
		}
		//
		if (root.getLeft() == null) {
			return minimumDepth(root.getRight()) + 1;
		}
		//
		if (root.getRight() == null) {
			return minimumDepth(root.getLeft()) + 1;
		}

		return Math.min(minimumDepth(root.getLeft()), minimumDepth(root.getRight())) + 1;
	}

	public int minimumDepth2(Node<Integer> root, int level) {
		if (root == null)
			return level;
		level++;
		return Math.min(minimumDepth2(root.getLeft(), level), minimumDepth2(root.getRight(), level));

	}
}
