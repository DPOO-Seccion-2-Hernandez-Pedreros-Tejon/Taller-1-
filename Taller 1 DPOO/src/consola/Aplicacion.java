package consola;

public class Aplicacion 
{
	public void ejecutarAplicacion()
	{
		System.out.println("Estadísticas sobre los Juegos Olímpicos\n");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					nada();
				else if (opcion_seleccionada == 2)
					nada();
				else if (opcion_seleccionada == 3)
					nada();
				else if (opcion_seleccionada == 4)
					nada();
				else if (opcion_seleccionada == 5)
					nada();
				else if (opcion_seleccionada == 0)	
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}
				
				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	private void nada() {
		/** clase provisional que no hace nada */
	}

	private String input(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Muestra al usuario el menú con las opciones para que escoja la siguiente
	 * acción que quiere ejecutar.
	 */
	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar un archivo de atletas");
		System.out.println("2. Consultar los atletas de un año dado");
		System.out.println("3. Consultar las medallas de un atleta en un periodo");
		System.out.println("4. Consultar los atletas de un país dado");
		System.out.println("5. Consultar el país con más medallistas");
		System.out.println("0. Consultar todos los medallistas de un evento dado");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
