import java.util.Arrays;

public class TreePrint {

	public int[] theArray;
	
	public int arraySize;
	
	public BinaryTree tree;
	
	TreePrint(int[] array){
		
		arraySize = array.length;
		
		theArray = array;
		
		tree = new BinaryTree(theArray);
		
	}
	
	
	public void printArray(){
		
		for(int i = 0; i < arraySize; i ++) {
			
			if(i < arraySize - 1) {
				
				System.out.print(theArray[i] + ", ");
				
			}
			else {
				
				System.out.print(theArray[i] + "\n");
				
			}
			
		}
		
	}
	
	public void printTree(Node root) {
		int counter = 0;
		Node hold = root;
		int NumSpaces = 5;
		
		while(counter <= NumSpaces) {
			
			if(hold == root) {
				for(int i = 0; i < NumSpaces; i++) {
					
					System.out.print(" ");
					
				}
				
				System.out.print(hold.value + "\n");
				counter++;
				hold = hold.left;
				continue;
			}
			
			else {
				
				if(hold != null) {
					
					
					
					
					
					
				}
				
			}
			
		}
		
	}
	
	
	
	class BinaryTree{
		Node root;
		int[] array;
		
		
		BinaryTree(int[] array){
		
		this.array = array;
		root = null;
		
		makeTree(0, root, root);
				
		}
		
		
		public void makeTree(int i, Node current, Node parent) {
			
			if(i == array.length) return;
			
			if(root == null) {
				
				root = new Node(array[i]);
				makeTree(i + 1, root, root);
				
			}
			
			else if(array[i] <  current.value) {
				
				if(current.left == null) {
					
					current.left = new Node(array[i]);
					
					makeTree(i + 1, root, root);
					
				}
				
				else {
					
					makeTree(i, current.left, current);
					
				}
			}
			
			else if(array[i] >  current.value) {
				
				if(current.right == null) {
					
					current.right = new Node(array[i]);
					
					makeTree(i + 1, root, root);
					
				}
				
				else {
					
					makeTree(i, current.right, current);
					
				}
			}
			
			
		}
		//This modifies the array instance in class Binary tree. So only run after binary tree
		//is made. 
		public void levelOrderArray(Node root, int index) {
			if(root == null) {
				return;
			}
			array[index] = root.value;
			levelOrderArray(root.left, index++);
			levelOrderArray(root.right, index++);
			
		}
		
		//This turns the tree into a full AVL tree. Only use once tree object is established
		public void completeTree(Node root) {
			
			
			
		}
		
		
	}
	
	class Node{
		
		int value;
		
		Node left;		
		Node right;
		
		Node(int value){
			
			this.value = value;
			
		}
		
		
	}
	
	
	
	
	
	
	public static void main (String args[]) {
		
		int[] treeToPrint = {5, 1, 76, 22, 13, 12, 75, 7, 9, 44};
		
		TreePrint t = new TreePrint(treeToPrint);
		
		//System.out.println(tree.numRows());
		
		t.printArray();
		
		t.tree.levelOrderArray(t.tree.root, 0);
		
		t.printArray();
		
	}
	
	
	
	
	
}