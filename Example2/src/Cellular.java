
public class Cellular {
	private String marca;
	private String model;
	private String color;
	private Double clong;
	private Double cwidth;
	private String procesor;
	private String mainMemory;
	private String storageMemory;
	private Double price;
	public Cellular(String marca, String model, Double price) {
		this.marca = marca;
		this.model = model;
		this.price = price;
	}
	public void call() {
		System.out.print("Esta llamando");
	}
	public void games() {
		System.out.print("Estoy jugando");
	}
	public void record() {
		System.out.print("Estoy grabando");
	}
	
	/*
	 * Son funciones Set y funciones Get
	 * */
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getClong() {
		return clong;
	}
	public void setClong(Double clong) {
		this.clong = clong;
	}
	public Double getCwidth() {
		return cwidth;
	}
	public void setCwidth(Double cwidth) {
		this.cwidth = cwidth;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public String getMainMemory() {
		return mainMemory;
	}
	public void setMainMemory(String mainMemory) {
		this.mainMemory = mainMemory;
	}
	public String getStorageMemory() {
		return storageMemory;
	}
	public void setStorageMemory(String storageMemory) {
		this.storageMemory = storageMemory;
	}
	
}
