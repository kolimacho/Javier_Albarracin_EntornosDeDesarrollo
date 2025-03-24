package Clases;

public class Main {

	// METODO MAIN
	public static void main(String[] args) {
		
		// Instanciamos un cuadrado y un circulo
		JAV_Circulo circulo1 = new JAV_Circulo(1, 3, "verde");
		JAV_Rectangulo rectangulo1 = new JAV_Rectangulo(1, 3, 3, "rojo");
	
		// Calcular el area de un rectangulo
		double area1 = rectangulo1.calcularAreaRectangulo(rectangulo1);
		
		// Calcular el area circulo pi*R2
		double area2 = circulo1.calcularAreaCirculo(circulo1);
		
		// Diferencias entre areas de cuadrado y circulo
		double diferencia = calcularDiferencia(area1, area2);
		
		// Imprimir datos
		printResultados(circulo1, rectangulo1, diferencia);
	}

	// METODO PARA IMPRIMIR RESULTADOS
	public static void printResultados(JAV_Circulo circulo1, JAV_Rectangulo rectangulo1, double diferencia) {
		System.out.println("Rectangulo: " + rectangulo1);
		System.out.println("Circulo: " + circulo1);
		System.out.println("Diferencia: " + diferencia);
	}

	// METODO CALCULAR DIFERENCIA ENTRE AREAS
	public static double calcularDiferencia(double area1, double area2) {
		double diferencia = area1-area2;
		System.out.println("Diferencia areas: " + diferencia);
		return diferencia;
	}

}