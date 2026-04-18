package Ejercicio8;

public class Main {
	 public static void main(String[] args) {
	        Rectangulo r = new Rectangulo(5, 4);
	        Circulo c = new Circulo(3);

	        System.out.println("area circulo " + r.calcularArea());
	        System.out.println("Area Rectangulo " + c.calcularArea());
	    }
}
