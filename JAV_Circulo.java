package Clases;

public class JAV_Circulo {
	private int id;
	private double Radio;
	private String Color;
	
	// CONSTRUCTOR
	public JAV_Circulo(int id, double radio, String color) {
		super();
		this.id = id;
		Radio = radio;
		Color = color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// METODO CALCULAR AREA CIRCULO
	public double calcularAreaCirculo(JAV_Circulo circulo1) {
		double radio1 = circulo1.getRadio();
		double area2 = radio1*3.14;
		System.out.println("Area cuadrado: " + area2);
		return area2;
	}
	
	// GETTERS Y SETTERS
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getRadio() {
		return Radio;
	}

	public void setRadio(double radio) {
		Radio = radio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "JAV_Circulo [id=" + id + ", Radio=" + Radio + ", Color=" + Color + "]";
	}

}
