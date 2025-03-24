package Clases;

/**
 * @author javier.albarracin
 * @version 1.0
 * Esta clase calcula contiene los atributos del circulo y calcula el area de este con 
 * el metodo calcularArea y tambien contiene los getters y setters.
 */

public class JAV_Circulo {
	// ATRIBUTOS CLASE CIRCULO
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
		// AGREGADO EL NUMERO MAGICO PI
		double area2 = radio1*Math.PI;
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
	
	// METODO TO STRING
	@Override
	public String toString() {
		return "JAV_Circulo [id=" + id + ", Radio=" + Radio + ", Color=" + Color + "]";
	}

}
