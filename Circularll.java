public class Circularll {
		Node tail,head;
		class Node{
			int data;
			Node nexts;
			Node(int data){
				this.data = data;
			}
		}
		void insert(int data) {
			Node newnode = new Node(data);
			if(head == null ) {
				head = newnode; 
				tail = newnode;
				tail.nexts = newnode;
			}
			else {
				tail.nexts = newnode;
				tail = newnode;
				tail.nexts = head;
			}
		}
		void displayele() {
			Node n1 = head;
			if(tail == null && head == null) {
				System.out.println("Empty List");
			}
			else {
				do {
					System.out.println(n1.data);
					n1 = n1.nexts;
				}while(n1 != head);
			}
		}
		void dele() {
			if(tail != head) {
				head = head.nexts;
				tail.nexts = head;
			}
			else {
				head = tail = null;
			}
			

		}
		public static void main(String[] args) {
			Circularll cl = new Circularll();
			cl.insert(20);
			cl.insert(23);
			cl.insert(2);
			cl.displayele();
			System.out.println("---------------------------------------------------------------------");
			cl.dele();
			cl.displayele();
		}
	}
