package Ejercicio10;

public class Main {
	public static void main(String[] args) {

        // Caso 1: Factura contado
        Cliente c1 = new Cliente("Pedro Lopez", "1234567-8");
        FacturaContado fc = new FacturaContado(1, c1, 1000, 200);

        System.out.println("=== FACTURA CONTADO ===");
        fc.mostrar();

        // Caso 2: Factura crédito
        Cliente c2 = new Cliente("Maria Perez", "9876543-2");
        FacturaCredito fcr = new FacturaCredito(2, c2, 1000, 150, 6);

        System.out.println("\n=== FACTURA CREDITO ===");
        fcr.mostrar();
        fcr.mostrarCuotas();

        // Caso 3: Validación (total negativo)
        FacturaContado fc2 = new FacturaContado(3, c1, 100, 200);

        System.out.println("\n=== VALIDACION ===");
        fc2.mostrar();
    }
}

/*
EXPLICACIÓN

En este ejercicio utilicé herencia usando "extends", donde la clase Factura
es la base y de ella se derivan FacturaContado y FacturaCredito.
Esto me permitió reutilizar código y no repetir lógica.

Sobrescribí el método calcularTotal() en ambas clases hijas usando @Override:
- En FacturaContado apliqué un descuento
- En FacturaCredito agregué un recargo
También validé que el total no sea negativo.

Usé "super" en los constructores para llamar al constructor de la clase padre.

Casos de prueba:
- Factura con descuento
- Factura con recargo
- Caso donde el total queda negativo (se valida y devuelve 0)

También apliqué encapsulamiento usando atributos privados y getters.

*/