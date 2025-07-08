class Node1{
	Node1 left,right;
	char key;
	Node1(char key){
		this.key = key;
	}
}
class BinarySolution{
	Node1 root;
	void delkey(char key) {
		root = deletefromtree(root,key);
	}
	Node1 deletefromtree(Node1 root, char key) {
		if(root == null) {
			return root;
		}
		if(key < root.key) {
			root.left = deletefromtree(root.left,key);
		}
		else if(key > root.key) {
			root.right = deletefromtree(root.right,key);
		}
		else {
			//Node with only one child
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			//Node with two children
			root.key = (char) minValue(root.right);
			root.right = deletefromtree(root.right,root.key);
		}
		return root;
	}
	int minValue(Node1 root) {
		int min = root.key;
		while(root.left != null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
	void insertkey(char key) {
		root = insertintree(root,key);
	}
	Node1 insertintree(Node1 root, char key) {
		if(root == null ) {
			root = new Node1(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertintree(root.left,key);
		}
		else if(key > root.key) {
			root.right = insertintree(root.right,key);
		}
		return root;
	}
	void preordertraversl(Node1 root) {
		if(root != null) {
			System.out.print(root.key + " ");
			preordertraversl(root.left);
			preordertraversl(root.right);
		}
		
	}
}
public class Binary_Search_Tree {
	public static void main(String[] args) {
		BinarySolution bs = new BinarySolution();
		bs.insertkey('c');
		bs.insertkey('b');
		bs.insertkey('a');
		bs.insertkey('i');
		bs.insertkey('g');
		bs.insertkey('m');
		bs.delkey('c');
		bs.insertkey('c');
		bs.preordertraversl(bs.root);
	}
}
