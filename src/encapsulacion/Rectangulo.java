package encapsulacion;

public class Rectangulo {

	private int base;
	private int altura;
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
public int area() {
	return (base*altura);		
}
public int perimetro() {
	return (2*(base+altura));
	
}
	
}
