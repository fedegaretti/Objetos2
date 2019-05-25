package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private int descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super(nombre, precio);

	}

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, int descuento) {
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	
	}

	
	public double getPrecio() {
		return super.getPrecio() - (super.getPrecio() * descuento) / 100;
	} 
	
}
