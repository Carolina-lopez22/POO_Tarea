package encapsulacion;

public class Fecha {
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	public int esValida() {
		if (dia<=31) {
			System.out.println("El dia es invalido");
			if(mes<=12) {
				System.out.println("El mes es invalido");
			} 
			return 0;	
		}
		return 0;
	}
	public String mostrar() {
		return "Fecha"+dia+"-"+mes+"-"+año;
		}
	}
	
