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
	public boolean esValida() {
		return (dia<=31) && (mes<=12);
			} 

	public String mostrar() {
		return "Fecha: "+dia+"-"+mes+"-"+año;
		}
	}
	
