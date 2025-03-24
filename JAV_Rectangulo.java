package Clases;

public class JAV_Rectangulo {
	// ATRIBUTOS
	private int Id;
	private double ladoA;
	private double ladoB;
	private String Color;
	
	// GETTERS AND SETTERS
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	// CONSTRUCTOR
	public JAV_Rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		Id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		Color = color;
	}

	@Override
	public String toString() {
		return "JAV_Rectangulo [Id=" + Id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", Color=" + Color + "]";
	}
	
	// METODO MAIN
	public static void main(String[] args) {
		

	}

}
