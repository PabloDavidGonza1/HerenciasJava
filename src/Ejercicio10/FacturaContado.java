package Ejercicio10;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        // Uso de super para reutilizar constructor
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        // Aplicamos descuento
        double resultado = total - descuento;

        // Validación para evitar negativos
        return (resultado < 0) ? 0 : resultado;
    }
}
