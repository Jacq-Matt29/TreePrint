import java.util.Arrays;
//Test
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
	
	public void printTree() {
		
		
	}
	
	
	public int numRows() {
		
		int rows = 0;		
		int counter = 0;
		
		while(counter <= arraySize) {
			
			counter = (counter * 2) + 1;
			
			rows++;
			
		}
		
		return rows;
		
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
				
				root.value = array[i];
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
		 
		
		public boolean moreThanTwo(Node test) {
			
			Node current = test;
			return false;
			
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
		
		TreePrint tree = new TreePrint(treeToPrint);
		
		//System.out.println(tree.numRows());
		
		tree.printArray();
		
	}
	
	
	
	
	
}
