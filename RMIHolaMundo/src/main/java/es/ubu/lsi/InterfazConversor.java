package es.ubu.lsi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz de conversión.
 */
public interface InterfazConversor extends Remote {
	/**
	 * Método de conversión de grados a Fahrenheit.
	 * 
	 * @param gradosCelsius Recibido como parámetro.
	 * @return Devuelve la conversión.
	 * @throws RemoteException Excepción de comunicación.
	 */
	double conversor(int gradosCelsius) throws RemoteException;
}
