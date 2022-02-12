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
	
	private int getPrecioIva()
	{
		return (int)(19.0 * this.getPrecioNeto() / 100.0);
	}
	
	private int getPrecioTotal()
	{
		return this.getPrecioNeto() + this.getPrecioIva();
	}
	
	private String generarTextoFactura()
	{
		String txtProductos = "";
		
		for(IProducto producto: itemsPedido)
		{
			txtProductos += "   " + producto.getNombre() + ": 		 $" + Integer.toString(producto.getPrecio())+ "/n";
		}
		
		return "			NOMBRE RESTAURANTE/n"
				+ "/n"
				+ "   ID DEL PEDIDO:		" + Integer.toString(this.getIdPedido()) + "/n"
				+ "   NOMBRE DEL CLIENTE: 		" + nombreCliente + "/n"
				+ "   DIRECCIÓN DE FACTURACIÓN: 		 " + direccionCliente + "/n"
				+ "/n"
				+ "   PRODUCTOS DE LA ORDEN 		PRECIO/n"
				+ txtProductos + "/n"
				+ "   VALOR NETO DEL PEDIDO:		 $" + Integer.toString(this.getPrecioNeto()) + "/n"
				+ "   VALOR DEL IVA DEL PEDIDO:		 $" + Integer.toString(this.getPrecioIva()) + "/n"
				+ "   VALOR TOTAL DEL PEDIDO:		 $" + Integer.toString(this.getPrecioTotal()) + "/n/n";
	}
}
