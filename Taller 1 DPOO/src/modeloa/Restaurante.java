package src.modeloa;

import java.io.BufferedReader;
/**import java.io.File;*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Restaurante 
{
	
	
	
	private ArrayList<Ingrediente> ingredientes;
	
	private ArrayList<ProductoMenu> productosMenu;
	
	private ArrayList<Combo> combos;
	
	public Restaurante() 
	{
		
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{	
		
	}
	
	public void cargarInformacionRestaurante() throws FileNotFoundException, IOException
	{
		
		 
		 cargarIngredientes();
		 
		 cargarMenu();
		 
		 cargarCombos();
	}
	
	private void cargarIngredientes() throws IOException,FileNotFoundException
	{
		
		FileReader file = new FileReader("Data/ingredientes.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			String[] ingredienteCosto = line.split(";");
			ingredientes.add( new Ingrediente(ingredienteCosto[0], Integer.parseInt(ingredienteCosto[1])) );
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
	
	private void cargarMenu() throws IOException, FileNotFoundException
	{
		
		FileReader file = new FileReader("Data/menu.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			String[] productoCosto = line.split(";");
			productosMenu.add( new ProductoMenu(productoCosto[0], Integer.parseInt(productoCosto[1])) );
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
	
	
	private void cargarCombos() throws IOException, FileNotFoundException
	{
		
		FileReader file = new FileReader("Data/combos.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			String combo = line.replace("%", "");
			String[] comboDescuentoIngredientes = combo.split(";");
			String nombreCombo = comboDescuentoIngredientes[0];
			String descuentoCombo = comboDescuentoIngredientes[1];
			ArrayList<ProductoMenu> itemsCombo = new ArrayList<ProductoMenu>();
			int i = 2;
			int max = comboDescuentoIngredientes.length;
			
			while(i < max)
			{
				String ing = comboDescuentoIngredientes[i];
				for(ProductoMenu producto: productosMenu)
				{
					if(producto.getNombre() == ing)
					{
						int costo = producto.getPrecio();
						itemsCombo.add(new ProductoMenu(ing, costo));
					}
				}
				i ++;
			}
			
			combos.add(new Combo(nombreCombo, Double.parseDouble(descuentoCombo), itemsCombo));
			
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
}
