package empresa;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private long cuit;
	private ArrayList<Empleado> empleados;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCuit() {
		return cuit;
	}
	public void setCuit(long cuit) {
		this.cuit = cuit;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public int totalPagoDeSueldos() {
		int total=0;
		for(Empleado e : empleados) {
			total += e.sueldoNeto();
		}
		return total;
	}
	public int totalSueldosBrutos() {
		int total=0;
		for(Empleado e : empleados) {
			total += e.sueldoBruto();
		}
		return total;
	}
	public int totalRetenciones() {
		int total = 0;
		for(Empleado e : empleados) {
			total += e.retenciones();
		}
		return total;
	}
}
