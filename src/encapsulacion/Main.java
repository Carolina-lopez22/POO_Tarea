package encapsulacion;

public class Main {

	public static void main(String[] args) {
	ejercicio1();
	ejercicio2();
	ejercicio3();
	ejercicio4();
	ejercicio5();
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
	private static void ejercicio3() {
		Producto produ1 = new Producto(001,"Televisor", 4500);
		Producto produ2 = new Producto(002,"Lavadora", 7000);
		
		produ1.aplicarDescuento(15);
		produ2.aplicarDescuento(25);
		
		System.out.println(produ1.mostrar());
		System.out.println(produ2.mostrar());
	}
	private static void ejercicio4() {
		Cuenta cuen1 = new Cuenta("CARLA.MARROQUIN", 500);
		
		cuen1.depositar(500);
		cuen1.retirar(-100);
		cuen1.depositar(200);
		cuen1.retirar(600);
		
		System.out.println(cuen1.mostrar());
	}
	private static void ejercicio5() {
		Libro lib1 = new Libro("Las 7 maravillas", "Hugo.Fabela", 500);
		Libro lib2 = new Libro("No estas en la lista", "Hugo.Fabela", 100);
		Libro lib3 = new Libro("Las 7 maravillas", "Hugo.Fabela", 500);
		
		if (lib1.esLargo()) {
			System.out.println(lib1.mostrar() + "El libro tienes mas de 300 pag.");
		}
		if (lib2.esLargo()) {
			System.out.println(lib1.mostrar() + "El libro tienes mas de 300 pag.");
		}
		if (lib3.esLargo()) {
			System.out.println(lib1.mostrar() + "El libro tienes mas de 300 pag.");
		}
		
	}
	}

		

