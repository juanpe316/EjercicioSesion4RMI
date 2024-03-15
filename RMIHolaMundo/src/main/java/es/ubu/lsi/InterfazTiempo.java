package es.ubu.lsi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz de tiempo.
 */
public interface InterfazTiempo extends Remote{
	/**
	 * Método para devolver la hora actual.
	 * @return Devuelve la hora actual.
	 * @throws RemoteException Excepción de comunicación. 
	 */
	String horaActual() throws RemoteException;
}
