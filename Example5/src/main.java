import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Integer option = -1;
		ManagementGrades mangementgrade = new ManagementGrades();
		do {
			System.out.println("(1) Agregar Nota");
			System.out.println("(2) Ver notas");
			System.out.println("(3) Ver aprobados");
			System.out.println("(4) Salir");
			option = Integer.parseInt(read.nextLine());
			switch(option) {
				case 1: {
					System.out.println("Ponga una nota");
					Integer grade = Integer.parseInt(read.nextLine());
					mangementgrade.addGrade(grade);
					break;
				}
				case 2: {
					mangementgrade.printGradeAll();
					break;
				}
				case 3: {
					mangementgrade.printGradeSuccess();
					break;
				}
			}
		} while(option != 4);
		System.out.println("Terminado!");
	}

}
