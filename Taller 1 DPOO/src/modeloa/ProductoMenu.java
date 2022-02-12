package src.modeloa;

public class ProductoMenu implements IProducto
{

	private String nombre;
	private int precioBase;
	
	public ProductoMenu(String pnombre, int precio)
	{
		nombre = pnombre;
		precioBase = precio;
	}
	public int getPrecio() 
	{
		return precioBase;
	}
	
	public String getNombre() 
	{
		return nombre;
	} 
	
	public String generarTextoFactura() {
		return nombre + ":      $" + precioBase;
	}

}
