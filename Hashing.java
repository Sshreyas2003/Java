import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
	public static void main(String[] args) {
		HashMap <String, Integer> Student = new HashMap<>();
		Student.put("Suguna", 1);
		Student.put("Aneesh", 2);
		Set<String> data = Student.keySet();
		for(String i : data) {
			System.out.println(Student.get(i));
		}
		Set<Map.Entry<String, Integer>> y = Student.entrySet();
		for(Map.Entry<String, Integer> i : y) {
			System.out.println(i.getValue() + " " + i.getKey());
		}
	}

}
