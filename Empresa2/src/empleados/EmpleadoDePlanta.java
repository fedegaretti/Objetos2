package empleados;

public class EmpleadoDePlanta extends Empleado {
	private int sueldoBasico;
	private int cantHijos;
	

	public int getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public int getCantHijos() {
		return cantHijos;
	}


	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public int GananciaPorCantidadDeHijos() {
		return this.getCantHijos() * 150;	
	}
	
	public int SueldoBruto() {
		return this.GananciaPorCantidadDeHijos() + this.getSueldoBasico();
	}


	public EmpleadoDePlanta(int cantHijos) {
		this.cantHijos = cantHijos;
		this.sueldoBasico = 3000;
	}
	
}