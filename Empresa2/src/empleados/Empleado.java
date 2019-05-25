package empleados;

public abstract class Empleado {
	
	public int sueldoNeto() {
		int sueldo;
		sueldo = this.SueldoBruto() - this.Descuentos();
		return sueldo;
	}
	
	public int Descuentos() {
		int descuento;
		descuento = (int) (this.SueldoBruto() * 0.13);
		return descuento;
	}
	
	public abstract int SueldoBruto();

	
}
