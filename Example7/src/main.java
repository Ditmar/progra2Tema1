import java.util.HashSet;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> days = new HashSet<>();
		days.add("Lunes");
		days.add("Martes");
		days.add("Lunes");
		days.remove("Martes");
		System.out.print(days.size());
		for (String s : days) {
			System.out.println(s);	
		}
	}

}
