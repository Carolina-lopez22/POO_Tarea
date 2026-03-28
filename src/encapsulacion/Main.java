package encapsulacion;

public class Main {

	public static void main(String[] args) {
	ejercicio1();
	ejercicio2();
	ejercicio3();
	ejercicio4();
	ejercicio5();
	ejercicio6();
	ejercicio7();
	}
	
	private static void ejercicio1() {
		Persona per1 = new Persona("Carolina", "Lopez", 22);
		Persona per2 = new Persona("Daniel", "Lemus", 25);
		Persona per3 = new Persona("Vanessa", "Molina", 23);
		
		System.out.println("Ejercicio 1");
		System.out.println(per1.mostrar());
		System.out.println(per2.mostrar());
		System.out.println(per3.mostrar());
		System.out.println("____________________________________________________________");
	}	
	private static void ejercicio2() {
		Rectangulo rect1 = new Rectangulo(5, 10);
		Rectangulo rect2 = new Rectangulo(8, 13);
		
		int area1 = rect1.area();
		int area2 = rect2.area();
		System.out.println("Ejercicio 2");
		if (area1 > area2) {
			System.out.println("El rectangulo con mayor area es el rectangulo 1: " + area1);
		}
		else {
			System.out.println("El rectangulo con mayor area es el rectangulo 2: " + area2);
			System.out.println("____________________________________________________________");
		}	
	}
	private static void ejercicio3() {
		Producto produ1 = new Producto(001,"Televisor", 4500);
		Producto produ2 = new Producto(002,"Lavadora", 7000);
		
		produ1.aplicarDescuento(15);
		produ2.aplicarDescuento(25);
		
		System.out.println("Ejercicio 3");
		System.out.println(produ1.mostrar());
		System.out.println(produ2.mostrar());
		System.out.println("____________________________________________________________");
	}
	private static void ejercicio4() {
		Cuenta cuen1 = new Cuenta("CARLA.MARROQUIN", 500);
		System.out.println("Ejercicio 4");
		cuen1.depositar(500);
		cuen1.retirar(-100);
		cuen1.depositar(200);
		cuen1.retirar(600);
		
		System.out.println(cuen1.mostrar());
		System.out.println("____________________________________________________________");
	}
	private static void ejercicio5() {
		Libro lib1 = new Libro("Las 7 maravillas", "Hugo.Fabela", 500);
		Libro lib2 = new Libro("No estas en la lista", "Alison.Espach", 480);
		Libro lib3 = new Libro("La Perla", "John.Steinbeck", 96);
		System.out.println("Ejercicio 5");
		if (lib1.esLargo()) {
			System.out.println(lib1.mostrar() + " El libro es largo.");
		}
		if (lib2.esLargo()) {
			System.out.println(lib2.mostrar() + " El libro es largo.");
		}
		if (lib3.esLargo()) {
			System.out.println(lib3.mostrar() + " El libro es largo.");
		}	
		System.out.println("____________________________________________________________");
		}
		private static void ejercicio6() {
			Calculadora operacion1 = new Calculadora(80,7);
			Calculadora operacion2 = new Calculadora(4,0);
			System.out.println("Ejercicio 6");
			System.out.println("Suma: "+ operacion1.sumar());
			System.out.println("Resta: "+operacion1.restar());
			System.out.println("Multiplicación: "+operacion1.multiplicar());
			System.out.println("Divición: "+ operacion1.dividir());
			System.out.println("Divición: "+operacion2.dividir());
			System.out.println("____________________________________________________________");
		}
		private static void ejercicio7() {
			Fecha fech1 = new Fecha(5,12,2022);
			Fecha fech2 = new Fecha(40,2,2003);
			Fecha fech3 = new Fecha(19,15,2025);
			System.out.println("Ejercicio 7");
			if (fech1.esValida()) {
			System.out.println(fech1.mostrar()+" La fecha es valida");}
			else {
				System.out.println(fech1.mostrar()+" La fecha es invalida");
			}
			if (fech2.esValida()) {
				System.out.println(fech2.mostrar()+" La fecha es valida");}
				else {
					System.out.println(fech2.mostrar()+" La fecha es invalida");
				}
			if (fech3.esValida()) {
					System.out.println(fech3.mostrar()+" La fecha es valida");}
				else {
					System.out.println(fech3.mostrar()+" La fecha es invalida");
					System.out.println("____________________________________________________________");
		}
		}
	}

		

