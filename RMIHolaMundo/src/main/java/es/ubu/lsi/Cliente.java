package es.ubu.lsi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Cliente remoto.
 */
public class Cliente {

	/**
	 * Constructor oculto,
	 */
	private Cliente() {
	}

	/**
	 * Método raíz.
	 *
	 * @param args host con el registro
	 */
	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host, 1100);
			
			//Operación Resta
			InterfazResta resta = (InterfazResta) registry.lookup("Resta");
			int resultado = resta.devolverResta(10, 2);
			System.out.println("Resultado de la resta: " + resultado);
			
			//Tiempo actual
			InterfazTiempo tiempo = (InterfazTiempo) registry.lookup("Tiempo");
			String hora=tiempo.horaActual();
			System.out.println("Hora actual "+hora);
			
			//Conversor de Celsius a Fahrenheit
			InterfazConversor conversion=(InterfazConversor) registry.lookup("Conversor");
			int gradosCelsius=32;
			double conver=conversion.conversor(gradosCelsius);
			System.out.println("Grados Celsius: "+gradosCelsius+" a Fahrenheit: "+conver);
		} catch (Exception e) {
			System.err.println("Excepción en cliente: " + e.toString());
		} // try

	} // main

} // Cliente