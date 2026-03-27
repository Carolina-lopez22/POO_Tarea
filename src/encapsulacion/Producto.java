package encapsulacion;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	public double aplicarDescuento(double porcentaje) {
		return precio= precio-(precio*porcentaje/100);
	}
	public String mostrar() {
		return "Producto: "+ codigo + " " + nombre+ " Precio: "+ precio;		
	}
}
