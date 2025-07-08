class Node{
	char key;
	Node left,right;
	Node(char key){
		this.key = key;
	}
}
class traversal{
	Node root;
	void PreorderTraversal(Node n) {
		if(n != null) {
			System.out.print(n.key + " "+ "");
			PreorderTraversal(n.left );
			PreorderTraversal(n.right );
		}
	}
	void Inorder(Node n) {
		if( n != null) {
			Inorder(n.left);
			System.out.print(n.key + " ");
			Inorder(n.right);
		}
	}
	void Postorder (Node n) {
		if(n != null) {
			Postorder(n.left);
			Postorder(n.right);
			System.out.print(n.key + " ");
		}
	}
}
public class Binarytree {
	public static void main(String[] args) {
		traversal t = new traversal();
		t.root = new Node('A');
		t.root.left = new Node('B');
		t.root.right = new Node('C');
		t.root.left.left = new Node('D');
		t.root.left.right = new Node('E');
		t.root.right.left = new Node('F');
		t.root.right.right = new Node('G');
		t.PreorderTraversal(t.root);
		System.out.println();
		t.Inorder(t.root);
		System.out.println();
		t.Postorder(t.root);
	}
}
