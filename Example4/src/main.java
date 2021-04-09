import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escriba un Texto");
		Scanner read = new Scanner(System.in);
		String keyboardRead = read.nextLine();
		StringBuild build = new StringBuild(keyboardRead);
		System.out.print(build.reverse().toString());
		/*String reverse = "";
		for (int i = keyboardRead.length(); i > 0; i--) {
			reverse += keyboardRead.substring(i-1, i);
		}
		System.out.println(reverse);*/
	}

}
