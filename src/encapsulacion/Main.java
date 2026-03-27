package encapsulacion;

public class Main {

	public static void main(String[] args) {
	ejercicio1();
	ejercicio2();
	}
	
	private static void ejercicio1() {
		Persona per1 = new Persona("Carolina", "Lopez", 22);
		Persona per2 = new Persona("Daniel", "Lemus", 25);
		Persona per3 = new Persona("Vanessa", "Molina", 23);
		
		System.out.println(per1.mostrar());
		System.out.println(per2.mostrar());
		System.out.println(per3.mostrar());
		
	}	
	private static void ejercicio2() {
		Rectangulo rect1 = new Rectangulo(5, 10);
		Rectangulo rect2 = new Rectangulo(8, 13);
		
		int area1 = rect1.area();
		int area2 = rect2.area();
		
		if (area1 > area2) {
			System.out.println("El rectangulo con mayor area es el rectangulo 1: " + area1);
		}
		else {
			System.out.println("El rectangulo con mayor area es el rectangulo 2: " + area2);
		}
		
	}
	}
		

