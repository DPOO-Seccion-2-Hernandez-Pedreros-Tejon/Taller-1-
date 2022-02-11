package src.modeloa;

import java.util.ArrayList;

public class Combo implements IProducto
{

	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	private int precio = 0;
	
	public Combo(String nombreCo, double descuentoCo)
	{
		nombreCombo = nombreCo;
		descuento = descuentoCo;
		itemsCombo = new ArrayList<ProductoMenu>();
	}

	public void agregarItemACombo(ProductoMenu itemCombo)
	{
		itemsCombo.add(itemCombo);
		precio += itemCombo.getPrecio();
	}
	
	public int getPrecio() 
	{	
		return precio; 
	}

	public String getNombre() 
	{
		return nombreCombo;
	}

	public String generarTextoFactura() 
	{
		return (nombreCombo + "      $" + Integer.toString(precio));
	}

}
