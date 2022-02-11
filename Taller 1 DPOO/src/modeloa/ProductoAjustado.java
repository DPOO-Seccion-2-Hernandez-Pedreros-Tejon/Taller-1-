package src.modeloa;

import java.util.ArrayList;

public class ProductoAjustado implements IProducto
{
	
	private ProductoMenu base;
	private ArrayList<Ingrediente> agregados;
	private ArrayList<Ingrediente> eliminados;
	private int precioFinal;

	public ProductoAjustado( ProductoMenu base)
	{
		
		this.base = base;
		agregados = new ArrayList<Ingrediente>();
		agregados = new ArrayList<Ingrediente>();

	}
	
	public int getPrecio() {
		int rta = base.getPrecio();
		for (int i = 0; i < agregados.size(); i++)
		{
			
		}
		return 0;
	}

	public String getNombre() {
		return null;
	}

	public String generarTextoFactura() {
		
		return base.generarTextoFactura();
	}

	public void agregarAAgregados(Ingrediente ingr)
	{
		agregados.add(ingr);
		
	}
	
}
