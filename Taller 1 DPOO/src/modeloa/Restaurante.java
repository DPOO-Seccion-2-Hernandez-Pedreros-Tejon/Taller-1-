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
	
	public Restaurante() 
	{
		
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente)
	{	
		
	}
	
	
	public void cargarInformacionRestaurante() throws FileNotFoundException, IOException
	{
		
		 cargarCombos();
		 //cargarIngredientes();
		 //cargarMenu();
	}
	
	private void cargarIngredientes() throws IOException,FileNotFoundException
	{
		
		FileReader file = new FileReader("Data/ingredientes.txt");
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
		
		FileReader file = new FileReader("Data/menu.txt");
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
		
		FileReader file = new FileReader("Data/combos.txt");
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
