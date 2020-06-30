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
	
	public void sortArray() {
		
		Arrays.sort(theArray);
		
	}
	
	
	
	class BinaryTree{
		Node root;
		int[] array;
		
		
		//the Binary Tree constructor
		BinaryTree(int[] array){
		
		this.array = array;
		root = null;
		
		makeTree(0, root, root);
				
		}
		
		
		//After everyInsertion run the balance algoritim that will come down from the root
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
				else makeTree(i, current.left, current); 
			
			//Reblance section
			
			//if theArray[i] < node && balance <> -1 or 1 etc...
			
			
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
		public void completeTree(Node current) {
			int leftValue = 0;
			int rightValue = 0;
			
			//findBalance for right and left for each node
			
		}
		
		public int findHeight(Node current) {
			
			if(current == null) {
				
				return -1;
				
			}
			
			return 1 + Math.max(findHeight(current.left), findHeight(current.right));
			
		}
		
		
		public int balanceFactor(Node current) {
			
			if(current == null) {
				
				return 0;
				
			}
			return findHeight(current.left) - findHeight(current.right);
			
		}
		
		
		//always start the rebalance one level down from the root
		public void rebalanceTree(Node root) {
			
			if(root == null) return;
			
			// left left case
			if(balanceFactor(root) > 1) {
				
				
				
			}
			
		}
		
		
		public Node rightRotation(Node current) {
			Node left = current.left;
			Node leftRight = left.right;
			
			left.right = current;
			current.left = leftRight;
			
			//Return the root of the subTree
			return left;
		}
		
		public Node leftRotation(Node current) {
			Node right = current.right;
			Node rightLeft = right.left;
			
			right.left = current;
			current.left = rightLeft;
			
			return right;
			
		}
		
		
		
		
		
		public Node find(int nodeVal) {
			
			return null;
			
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
		
		int[] treeToPrint = {29, 14, 47, 22, 13, 36, 75, 2, 31, 44};
		
		TreePrint t = new TreePrint(treeToPrint);
		
		//System.out.println(tree.numRows());
		
		t.printArray();
		
		t.tree.levelOrderArray(t.tree.root, 0);
		
		t.printArray();
		
		t.sortArray();
		
		t.printArray();
		
		System.out.println(t.tree.findHeight(t.tree.root));
		
		System.out.println(t.tree.balanceFactor(t.tree.root));
		
	}
	
	
	
	
	
}