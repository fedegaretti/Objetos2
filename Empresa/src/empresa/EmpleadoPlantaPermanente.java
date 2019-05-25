package empresa;

import java.time.LocalDate;

public class EmpleadoPlantaPermanente extends Empleado {

	private int cantHijos;
	private int antiguedad;// Años

	public EmpleadoPlantaPermanente(String nombre, Direccion direccion, EstadoCivil estadoCivil,
			LocalDate fechaDeNacimiento, int sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int asignacionPorHijo() {
		return 150 * this.getCantHijos();
	}

	public int asignacionPorConyuge() {
		if (this.getEstadoCivil().esSoltero()) {
			return 0;
		} else {
			return 100;
		}
	}

	public int asignacionPorAntiguedad() {
		return this.getAntiguedad() * 50;
	}
	public int salarioFamiliar() {
		return this.asignacionPorConyuge() + this.asignacionPorHijo();
	}

	public int sueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar() + this.asignacionPorAntiguedad();	
	}
	public int retencionObraSocial() {
		return (int) (this.sueldoBruto() * 0.1 + this.getCantHijos() * 20);
	}
	public int retencionAportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.15);
	}
	public int retenciones() {
		return this.retencionAportesJubilatorios() + this.retencionObraSocial();
	}
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
}

