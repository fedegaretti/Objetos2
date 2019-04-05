package empresa;

import java.time.LocalDate;

public class EmpleadoPlantaTemporaria extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int cantHorasExtra;

	public EmpleadoPlantaTemporaria(String nombre, Direccion direccion, EstadoCivil estadoCivil,
			LocalDate fechaDeNacimiento, int sueldoBasico, LocalDate fechaFinDesignacion, int cantHorasExtra) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.cantHorasExtra = cantHorasExtra;
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion;
	}

	public void setFechaFinDesignacion(LocalDate fechaFinDesignacion) {
		this.fechaFinDesignacion = fechaFinDesignacion;
	}

	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public void setCantHorasExtra(int cantHorasExtra) {
		this.cantHorasExtra = cantHorasExtra;
	}

	public int asignacionPorHorasExtra() {
		return this.getCantHorasExtra() * 40;
	}

	public int sueldoBruto() {
		return this.getSueldoBasico() + this.asignacionPorHorasExtra();
	}

	public int extraPorMayorA50() {
		if (this.edad() > 50) {
			return 20;
		} else
			return 0;
	}

	public int retencionObraSocial() {
		return this.sueldoBruto() + this.extraPorMayorA50();
	}

	public int retencionAportesJubilatorios() {
		return (int) (this.sueldoBruto() * 0.1 + this.getCantHorasExtra() * 5);
	}

	public int retenciones() {
		return this.retencionAportesJubilatorios() + this.retencionObraSocial();
	}
	
	public int sueldoNeto() {
		return this.sueldoBruto() - this.retenciones();
	}
}
