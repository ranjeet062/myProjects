package com.test.tree;

import java.util.Stack;

public class BinaryTreeMain {

    Node<Integer> root;

	public static void main(String[] args) {
		
		BinaryTreeMain b = new BinaryTreeMain();
		b.root = new Node<Integer>(20);
		b.root.setLeft(new Node<Integer>(10));
		b.root.setRight(new Node<Integer>(30));
		b.root.getLeft().setLeft(new Node<Integer>(5));
		b.root.getLeft().setRight(new Node<Integer>(15));
		
		b.root.getRight().setLeft(new Node<Integer>(25));
		b.root.getRight().setRight(new Node<Integer>(35));
		// zigzag print
		/*ZigZagPrintTree zigZag= new ZigZagPrintTree();
		zigZag.printZigZag(b.root);*/
		
		// depth of tree
		DepthOfTree depthTree= new DepthOfTree();
		System.out.println(depthTree.minimumDepth(b.root));
		System.out.println(depthTree.minimumDepth2(b.root,0));
		
	}
}
