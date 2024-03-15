package es.ubu.lsi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Servidor remoto.
 *
 */
public class Servidor {

	/**
	 * Método raíz.
	 *
	 * @param args argumentos
	 */
	public static void main(String args[]) {

		try {
			Resta obj = new Resta();
			Tiempo objT=new Tiempo();
			Conversor objC=new Conversor();
			
			Registry registry = LocateRegistry.createRegistry(1100);
			registry.rebind("Resta", obj);
			registry.rebind("Tiempo", objT);
			registry.rebind("Conversor", objC);
			System.out.println("Servidor preparado");

		} catch (Exception e) {
			System.err.println("Excepción de servidor: " + e.toString());
			e.printStackTrace();
		}
	} // main

} // Servidor