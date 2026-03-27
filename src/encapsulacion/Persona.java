package encapsulacion;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String mostrar() {
		return "Nombre Completo: "+ nombre +" "+ apellido +" Edad: " + edad;
		
	}
}
