package encapsulacion;

public class Main {

	public static void main(String[] args) {
	ejercicio1();
	}
	
	private static void ejercicio1() {
		Persona per1 = new Persona("Carolina", "Lopez", 22);
		Persona per2 = new Persona("Daniel", "Lemus", 25);
		Persona per3 = new Persona("Vanessa", "Molina", 23);
		
		System.out.println(per1.mostrar());
		System.out.println(per2.mostrar());
		System.out.println(per3.mostrar());
		
	}	
	}
		

