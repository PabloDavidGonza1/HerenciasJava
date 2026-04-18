package Ejercicio2;

public class CuentaCorriente extends Cuenta {
    private double limite;

    public CuentaCorriente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    @Override
    public void retirar(double monto) {
        if (saldo - monto >= -limite) {
            super.retirar(monto);
        } else {
            System.out.println("Límite de sobregiro excedido");
        }
    }
}
