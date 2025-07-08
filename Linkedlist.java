import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList <Integer> l1 = new LinkedList<>();
		l1.add(100);
		l1.add(123);
		l1.add(10);
		l1.add(14);
		l1.add(0,124);
		l1.add(1);
		l1.add(000);
		System.out.println(l1);
		l1.remove(5);
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println(l1.contains(12));
		Stack <Integer> s1 = new Stack<>();
		for(int i =0; i < 10;i++) {
			s1.push(i);
		}
		System.out.println(s1);
		LinkedList <Integer> l2 = new LinkedList<>();
		l2.addAll(s1);
		Iterator its =  l2.iterator();
		while(its.hasNext()) {
			System.out.print(its.next() + " ");
		}
	}
}
