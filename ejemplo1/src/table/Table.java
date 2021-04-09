package table;

public class Table {
	//tablelong largo de la mesa
	//tableWidth ancho de la mesa
	private Integer tableLong;
	private Integer tableWidth;
	private String  color;
	String marca;
	//Constructor de clase
	//es el método que se ejecuta cuando 
	//la clase es instanciada Table table = new Table();
	public Table(Integer tlong, Integer twidth, String color) {
		tableLong = tlong;
		tableWidth = twidth;
		this.color = color;
	}
	//Calculo de la superficie
	public Integer area() {
		return this.tableLong * this.tableWidth;
	}
	//Funcion get para la propiedad del color
	public String getColor() {
		return this.color;
	}
	//Funcion set para el color
	public void setColor(String color) {
		this.color = color;
	}
	static void print() {
		System.out.println("Esto es la llamada de un método estático ");
	}
}
