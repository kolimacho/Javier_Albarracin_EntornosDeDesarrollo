package Clases;

public class Main {

	// METODO MAIN
	public static void main(String[] args) {
		// Instanciamos un cuadrado y un circulo
		JAV_Circulo circulo1 = new JAV_Circulo(1, 3, "verde");
		JAV_Rectangulo rectangulo1 = new JAV_Rectangulo(1, 3, 3, "rojo");
	
		// Calcular el area de un rectangulo
		double ladoA = rectangulo1.getLadoA();
		double ladoB = rectangulo1.getLadoB();
		double area1 = ladoA * ladoB;
		System.out.println("Area rectangulo: " + area1);
		
		// Calcular el area circulo pi*R2
		double radio1 = circulo1.getRadio();
		double area2 = radio1*3.14;
		System.out.println("Area cuadrado: " + area2);
		
		// Diferencias entre areas de cuadrado y circulo
		double diferencia = area1-area2;
		System.out.println("Diferencia areas: " + diferencia);
		
		// Imprimir datos
		System.out.println("Rectangulo: " + rectangulo1);
		System.out.println("Circulo: " + circulo1);
		System.out.println("Diferencia: " + diferencia);
	}

}
