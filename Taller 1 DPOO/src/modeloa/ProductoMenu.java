package src.modeloa;

public class ProductoMenu implements IProducto
{

	private String nombre;
	private int precioBase;
	
	
	public int getPrecio() {
		return 0;
	}
	
	public String getNombre() {
		return null;
	}
	
	public String generarTextoFactura() {
		return nombre + ":   $" + precioBase;
	}
	
	public ProductoMenu(String nombre, int precio)
	{
		this.nombre = nombre;
		precioBase = precio;
	}
	
	
}
