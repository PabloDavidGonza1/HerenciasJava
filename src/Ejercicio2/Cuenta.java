package Ejercicio2;

public class Cuenta {
	protected double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public void mostrar() {
        System.out.println("Saldo: " + saldo);
    }
}
