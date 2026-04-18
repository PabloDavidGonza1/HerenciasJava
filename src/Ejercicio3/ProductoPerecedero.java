package Ejercicio3;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento;

    public ProductoPerecedero(String nombre, String fechaVencimiento) {
        super(nombre);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        return true;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha: " + fechaVencimiento);
    }
}
