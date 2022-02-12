package src.modeloa;

import java.util.ArrayList;

public class Pedido 
{
	public static int numeroPedidos = 0;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private ArrayList<IProducto> itemsPedido;
	
	public Pedido(String pnombreCliente, String direccion)
	{
		nombreCliente = pnombreCliente;
		direccionCliente = direccion;
		numeroPedidos += 1;
		idPedido = numeroPedidos;
	}
	
	public void agregarProducto(IProducto producto)
	{
		itemsPedido.add(producto);
	}
	
	public int getIdPedido()
	{
		return idPedido;
	}
	
	private int getPrecioNeto()
	{
		int precio = 0;
		for(IProducto producto: itemsPedido)
		{
			precio += producto.getPrecio();
		}
		return precio;
	}
	
	private double getPrecioIva()
	{
		return 19.0 * this.getPrecioNeto() / 100.0;
	}
	
	private int getPrecioTotal()
	{
		return (int)(this.getPrecioNeto() + this.getPrecioIva());
	}
	
	private String generarTextoFactura()
	{
		return "			NOMBRE RESTAURANTE/n"
				+ "/n"
				+ "   ID DEL PEDIDO:		 " + Integer.toString(this.getIdPedido()) +"/n"
				+ "/n"
				+ "PRODUCTOS DE LA ORDEN		PRECIO/n"
				+ "";
	}
}
