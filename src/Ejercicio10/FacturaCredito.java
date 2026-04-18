package Ejercicio10;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        // Aplicamos recargo
        double resultado = total + recargo;

        // Validación
        return (resultado < 0) ? 0 : resultado;
    }

    public void mostrarCuotas() {
        System.out.println("Cuotas: " + cuotas);
    }
}
