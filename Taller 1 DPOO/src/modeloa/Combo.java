package src.modeloa;

import java.util.ArrayList;

public class Combo implements IProducto
{

	private double descuento;
	private String nombreCombo;
	private ArrayList<ProductoMenu> itemsCombo;
	
	public Combo(String nombreCo, double descuentoCo)
	{
		nombreCombo = nombreCo;
		descuento = descuentoCo;
		itemsCombo = new ArrayList<ProductoMenu>();
	}
	
	public void agregarItemACombo(IProducto itemCombo)
	{
		itemsCombo.add((ProductoMenu)itemCombo);
	}
	
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
