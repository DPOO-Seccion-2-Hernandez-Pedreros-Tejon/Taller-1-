package src.modeloa;

import java.io.BufferedReader;
/**import java.io.File;*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Restaurante {

	/** no hay atributos de Restaurante*/

	
	// ************************************************************************
	// métodos
	// ************************************************************************
	
	/** inicia un nuevo pedido */
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{
		
		
		
	}
	
	public void cargarInformacionRestaurante() throws FileNotFoundException, IOException
	{
		
		 cargarCombos();
		 cargarIngredientes();
		 cargarMenu();
	}
	
	private void cargarIngredientes() throws IOException,FileNotFoundException
	{
		
		FileReader file = new FileReader("Taller 1 DPOO/Data/ingredientes.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			message += line + " ";
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
	
	private void cargarMenu() throws IOException, FileNotFoundException
	{
		
		FileReader file = new FileReader("Taller 1 DPOO/Data/menu.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			message += line + " ";
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
	
	
	private void cargarCombos() throws IOException, FileNotFoundException
	{
		
		FileReader file = new FileReader("Taller 1 DPOO/Data/combos.txt");
		BufferedReader br = new BufferedReader(file);
		String message = "";
		String line = br.readLine();
		while(line != null)
		{
			message += line + " ";
			line = br.readLine();
		}
		System.out.println(message);
		br.close();
		
	}
}
