package consola;

public class Aplicacion 
{
	public void ejecutarAplicacion()
	{
		System.out.println("Hamburguesas y hamburguesas\n");

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
		/** método provisional que no hace nada. */
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
		System.out.println("1. Mostrar menú");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar el país con más medallistas");
		System.out.println("0. Consultar la información de un pedido dado su id");
	}
	
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.ejecutarAplicacion();
	}

}
