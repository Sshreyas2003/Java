import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseAL {
   static void rev(ArrayList <Integer> l1) {
	   int i = 0; 
	   int j = l1.size() - 1;
	   while( i < j) {
		   Integer temp = Integer.valueOf(l1.get(i));
		   l1.set(i, l1.get(j));
		   l1.set(j, temp);
		   i++;
		   j--;
	   }
	}
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter How Elements u want to add : ");
		int num = scan.nextInt();
		System.out.println("Please Enter all Elements :  " );
		while(num > 0) {
			int ele = scan.nextInt();
			l1.add(ele);
			num--;
		}
		rev(l1);
		System.out.println(l1);
		Collections.sort(l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println(l1);
	}
	
}
