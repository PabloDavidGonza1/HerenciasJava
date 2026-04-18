package Ejercicio10;

public class Factura {
	 private int numero;
	    private Cliente cliente;
	    protected double total; 

	    public Factura(int numero, Cliente cliente, double total) {
	        this.numero = numero;
	        this.cliente = cliente;
	        this.total = total;
	    }

	
	    public double calcularTotal() {
	        
	        return (total < 0) ? 0 : total;
	    }

	    public void mostrar() {
	        System.out.println("Factura No: " + numero);
	        System.out.println("Cliente: " + cliente.getNombre());
	        System.out.println("NIT: " + cliente.getNit());
	        System.out.println("Total: " + calcularTotal());
	    }
	}

