class Arrays_for_Quee{
	int front,rear;
	static int[]q;
	int Capacity;
	Arrays_for_Quee(int size){
		Capacity = size;
		q = new int[Capacity];
	}
	void Enquee(int value) {
		if(rear == Capacity) {
			System.out.println("Quee is Already full Cannot add Further");
		}
		else {
			q[rear] = value;
			rear++;
		}
	}
	void Dequee() {
		if(rear == 0) {
			System.out.println("Quee is Empty there is No Elements to Delete");
		}
		else {
			for(int i = 0; i < rear-1;i++) {
				q[i] = q[i+1];
			}
			rear--;

		}
	}
	void Display() {
		if(front == rear) {
			System.out.println("Nothing to display Please Add Something");
		}
		else {
			for(int i = 0; i < rear; i++) {
				System.out.println(q[i]);
			}
		}
	}
}
public class Quee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays_for_Quee Aq = new Arrays_for_Quee(5);
		Aq.Enquee(45);
		Aq.Enquee(56);
		Aq.Enquee(564);
		Aq.Enquee(23);
		Aq.Enquee(356);
		Aq.Dequee();
		Aq.Display();
	}

}
