package supermercado;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String direccion;
	private ArrayList<Producto> catalogoDeProductos;

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.catalogoDeProductos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getCatalogoDeProductos() {
		return catalogoDeProductos;
	}

	public void setCatalogoDeProductos(ArrayList<Producto> catalogoDeProductos) {
		this.catalogoDeProductos = catalogoDeProductos;
	}

	public void agregarProducto(Producto producto) {
		this.catalogoDeProductos.add(producto);
	}

	public int cantidadDeProductos() {
		int cant = 0;
		for (Producto producto : catalogoDeProductos) {
			cant += 1;
		}
		return cant;
	}
	
	public double precioTotal() {
		double total = 0;
		for(Producto producto : catalogoDeProductos) {
			total += producto.getPrecio();
		}
		return total;
	}
}
