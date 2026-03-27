package encapsulacion;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular, int saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	public double depositar(double monto) {
		if (monto < 0) {
			System.out.println("No se permite saldo negativo");			
}	else {
	return saldo=saldo+monto;
}
		return monto;
}	
	
	public double retirar(double monto) {
			if (monto < 0) {
				System.out.println("No se permite saldo negativo");			
	}	else {
		return saldo=saldo-monto; 
	}
			return monto;
	}
	public String mostrar() {
		return "Titular: " + titular +" "+"Saldo: "+ saldo;
	}

}
