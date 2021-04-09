import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		String hello = scanner.nextLine();
		System.out.println(hello);*/
		InputStreamReader inputstreamreader = new InputStreamReader(System.in);
		BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
		try {
			String information = bufferedreader.readLine();
			System.out.println(information);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.toString());
		}
	}

}
