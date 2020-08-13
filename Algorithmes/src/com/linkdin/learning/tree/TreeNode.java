package com.linkdin.learning.tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;
    private boolean isDeleted = false;
	
	public int getData() {
		return data;
	}

	public TreeNode(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode find(int data) {
		if (this.data == data && !isDeleted)
			return this;
		if (data < this.data && left != null)
			return left.find(data);
		if (right != null)
			return right.find(data);
		else
			return null;
	}

	public void insert(int data) {
		if (data >= this.data) {
			if (this.right == null) {
				this.right = new TreeNode(data);
			} else {
				this.right.insert(data);
			}
		} else {
			if (this.left == null) {
				this.left = new TreeNode(data);
			} else {
				this.left.insert(data);
			}

		}
	}
	
	public void delete(){
		this.isDeleted = true;
	}
	public boolean isDeleted(){
		return isDeleted;
	}
	public void traverseInOrder() {
		if (this.left != null)
			this.left.traverseInOrder();
		System.out.print(this + " ");
		if (this.right != null)
			this.right.traverseInOrder();
	}
	public void traversePreOrder() {
		System.out.print(this + " ");
		if (this.left != null)
			this.left.traverseInOrder();
		
		if (this.right != null)
			this.right.traverseInOrder();
	}
	public void traversePostOrder() {
		
		if (this.left != null)
			this.left.traverseInOrder();
		
		if (this.right != null)
			this.right.traverseInOrder();
		System.out.print(this + " ");
	}
	public int smallest(){
		if(this.getLeft() == null)
			return this.data;
		return this.getLeft().smallest();
	}
	
	public int largest(){
		if(this.getRight() == null)
			return this.data;
		return this.getRight().largest();
	}
	public boolean isLeaf() {
		return this.left == null && this.right == null;
	}
	
	public int noOfLeafNode() {
		if (isLeaf())
			return 1;
		int leftLeaves = 0;
		int rightLeaves = 0;
		if (this.left != null)
			leftLeaves = this.left.noOfLeafNode();
		if (this.right != null)
			rightLeaves = this.right.noOfLeafNode();
		return leftLeaves + rightLeaves;
	}

	public int height() {
		if (isLeaf())
			return 1;
		int left = 0;
		int right = 0;
		if (this.left != null)
			left = this.left.height();
		if (this.right != null)
			right = this.right.height();
		return (left > right) ? (left + 1) : (right + 1);
	}
	
}
