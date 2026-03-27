package encapsulacion;

public class Calculadora {
	private int numero1;
	private int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public int sumar() {
		return numero1 + numero2;
	}
	public int restar() {
		return numero1-numero2;	
	}
	public int multiplicar() {
		return numero1*numero2;
	}
	public double dividir() {
		if (numero2 == 0) {
			System.out.println("No se puede dividir entre 0");
			return 0;
		}
		return numero1/numero2;
	}

}
