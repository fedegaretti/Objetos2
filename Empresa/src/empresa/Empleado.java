package empresa;

import java.time.LocalDate;
import java.time.Period;

abstract class Empleado {
	private String nombre;
	private Direccion direccion;
	private EstadoCivil estadoCivil;
	private LocalDate fechaDeNacimiento;
	private int sueldoBasico;

	public Empleado(String nombre, Direccion direccion, EstadoCivil estadoCivil, LocalDate fechaDeNacimiento,
			int sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(int sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public int edad() {
		LocalDate fechaNacimiento = fechaDeNacimiento;
		LocalDate hoy = LocalDate.now();
		return Period.between(fechaNacimiento, hoy).getYears();
	}

	abstract int sueldoBruto();

	abstract int sueldoNeto();

	abstract int retenciones();
}
