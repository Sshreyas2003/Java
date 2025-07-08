import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		//Add
		l1.add(6);
		l1.add(7);
		l1.add(100);
		//Acess
		System.out.println(l1.get(0));
		//User
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter How Elements u want to add : ");
		int num = scan.nextInt();
		System.out.println("Please Enter all Elements :  " );
		while(num > 0) {
			int ele = scan.nextInt();
			l1.add(ele);
			num--;
		}
		//Display
		for(int i = 0; i < l1.size(); i++) {
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
		//Adding at index
		l1.add(2,909);
		//Changing Value at Index
		l1.set(1, 606);
		System.out.println(l1);
	}
}
