
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loteria loteria = new Loteria(5, 100, 40);
		Integer[] result = loteria.generate();
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
	}

}
