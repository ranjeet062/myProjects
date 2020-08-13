package com.test.tree;

import java.util.Stack;

public class ZigZagPrintTree {

	public void printZigZag(Node<Integer> root) {
		if (root == null) {
			return;
		}
		Stack<Node<Integer>> currentLabel = new Stack<>();
		Stack<Node<Integer>> nextLabel = new Stack<>();

		currentLabel.push(root);
		boolean leftToRight = true;

		while (!currentLabel.isEmpty()) {

			Node<Integer> popNode = currentLabel.pop();
			System.out.println(popNode.getData());

			if (leftToRight) {
				if (popNode.getLeft() != null) {
					nextLabel.push(popNode.getLeft());
				}
				if (popNode.getRight() != null) {
					nextLabel.push(popNode.getRight());
				}

			} else {
				if (popNode.getRight() != null) {
					nextLabel.push(popNode.getRight());
				}
				if (popNode.getLeft() != null) {
					nextLabel.push(popNode.getLeft());
				}

			}
			if(currentLabel.isEmpty())
			{
				leftToRight = !leftToRight;
				Stack<Node<Integer>> temp = currentLabel;
				currentLabel = nextLabel;
				nextLabel =temp;
			}
		}
	}
}
