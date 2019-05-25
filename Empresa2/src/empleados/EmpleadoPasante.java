package empleados;

public class EmpleadoPasante extends Empleado {

	private int horasTrabajadas;
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public int SueldoBruto() {
		return this.getHorasTrabajadas() * 40;
	}

	public EmpleadoPasante(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

}
