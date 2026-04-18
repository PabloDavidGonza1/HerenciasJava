package Ejercicio1;

public class Main {

	public static void main(String[] args) {
        Docente d = new Docente("Juan", 40, "Matemática");
        Estudiante e = new Estudiante("Ana", 20, "202501");

        d.mostrar();
        e.mostrar();
    }
}
