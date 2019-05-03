package empleados;

public class EmpleadoTemporario extends Empleado {
	private int horas;
	private int sueldoBasico;
	private boolean tieneHijos;
	private boolean estaCasado;
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}
	public int getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	public boolean tieneHijos() {
		return tieneHijos;
	}
	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	public boolean estaCasado() {
		return estaCasado;
	}
	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	public int SueldoBruto() {
		int sueldo;
		sueldo = this.getSueldoBasico() + this.GananciaPorHijosOMatrimonio() + this.GananciaPorHora();
		return sueldo;
	}
	public int GananciaPorHora() {
		return this.getHoras() * 5;
	}
	
	public int GananciaPorHijosOMatrimonio() {
		if (this.tieneHijos() || this.estaCasado()) {
			return 100;
		}else {
			return 0;
		}
	}
	public EmpleadoTemporario(int horas, boolean tieneHijos, boolean estaCasado) {
		super();
		this.horas = horas;
		this.sueldoBasico = 1000;
		this.tieneHijos = tieneHijos;
		this.estaCasado = estaCasado;
	}
	
}
