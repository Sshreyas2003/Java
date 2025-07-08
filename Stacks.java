import java.util.Iterator;
import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {
		Stack s1 = new Stack();
		Stack <Integer> s2 = new Stack<>();
		s2.push(223);
		s2.push(123);
		s2.push(59);
		System.out.println(s2);
		s2.pop();
		System.out.println(s2.peek());
		boolean status = s1.empty();
		System.out.println(status);
		s2.push(44);
		s2.push(99);
		s2.push(101);
		Iterator it = s2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(s2.size());
		//System.out.println(s2.sort(null));
		s2.sort(null);
		System.out.println(s2);
		System.out.println(s1.search(12));
	}
}
