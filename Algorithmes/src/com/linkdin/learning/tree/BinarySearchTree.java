package com.linkdin.learning.tree;

public class BinarySearchTree {

	private TreeNode root;
	
	public void insert(int data){
		if(root == null){
			this.root= new TreeNode(data);
		}else{
			root.insert(data);
		}
	}
	public TreeNode find(int data){
		if(this.root != null)
			return this.root.find(data);
		return null;
	}
	
	public int smallest(){
		if(this.root != null)
			return this.root.smallest();
		return 0;
	}
	
	public int largest(){
		if(root != null)
			return root.largest();
		return 0;
	}
	
	public void deleteSoft(int data){
		TreeNode toDelNode = find(data);
		toDelNode.delete();
	}
	
	public void delete(int data){
		TreeNode current = this.root;
		TreeNode parent = this.root;
		boolean isLeftChild = false;
		
		if(current == null)
			return ;
		while(current != null && current.getData() != data){
			parent= current;
			if(data < current.getData()){
				current = current.getLeft();
				isLeftChild = true;
			}else{
				current = current.getRight();
				isLeftChild = false;
			}
		}
		if(current == null){
			return;
		}
		if(current.getLeft() == null && current.getRight() == null){
			if(current == root){
				root = null;
			}else{
				if(isLeftChild)
					parent.setLeft(null);
				else
					parent.setRight(null);
			}
		}
		else if(current.getRight() == null){
			if(current == root){
				root = current.getLeft();
			}else{
				if(isLeftChild)
					parent.setLeft(current.getLeft());
				else
					parent.setRight(current.getLeft());
			}
				
		}
		else if(current.getLeft() == null){
			if(current == root){
				root = current.getRight();
			}else{
				if(isLeftChild)
					parent.setLeft(current.getRight());
				else
					parent.setRight(current.getRight());
			}
				
		}
		
	}
	
}
