import java.util.ArrayList;

//Administrador de Notas
public class ManagementGrades {
	ArrayList<Integer> gradeList;
	public ManagementGrades() {
		this.gradeList = new ArrayList<>();
	}
	public void addGrade(Integer grade) {
		this.gradeList.add(grade);
	}
	//Imprimir nota de todos
	public void printGradeAll() {
		for (Integer item : this.gradeList) {
			System.out.println(item);
		}
	}
	//Imprimir nota de solo aprobados
	public void printGradeSuccess() {
		for (Integer item : this.gradeList) {
			if (item > 50) {
				System.out.println(item);	
			}
		}
	}
}
