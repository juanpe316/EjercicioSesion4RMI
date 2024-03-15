package es.ubu.lsi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Clase conversor que realiza la conversión de Celsius a Fahrenheit.
 */
public class Conversor extends UnicastRemoteObject implements InterfazConversor {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor de conversor.
	 * 
	 * @throws RemoteException Excepción de comunicación.
	 */
	protected Conversor() throws RemoteException {
		super();
	}

	/**
	 * Método de conversión.
	 * 
	 * @return resultado Devuelve la conversión.
	 */
	public double conversor(int gradosCelsius) throws RemoteException {

		double resultado = 0;

		resultado = (gradosCelsius * 9 / 5) + 32;

		return resultado;
	}

}
