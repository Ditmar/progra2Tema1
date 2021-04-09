package ejemplo1;

import table.Table;

public class main {

	public static void main(String[] args) {
		//Creacion de las instancias
		Table table1 = new Table(2, 1, "Brown");
		Table table2 = new Table(10, 10, "Green");
		Table table3 = new Table(5, 8,  "yellow");
		System.out.println("La Superficie de la mesa es " + table1.area() + " El color es " + table1.getColor());
		System.out.println("La Superficie de la mesa es " + table2.area() + " El color es " + table2.getColor());
		System.out.println("La Superficie de la mesa es " + table3.area() + " El color es " + table3.getColor());
	} 

}
