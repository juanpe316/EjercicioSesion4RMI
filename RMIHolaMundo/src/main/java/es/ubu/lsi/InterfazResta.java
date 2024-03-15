package es.ubu.lsi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interfaz de resta.
 */
public interface InterfazResta extends Remote{
	/**
	 * Método para devolver la resta.
	 * @param a Número recibido.
	 * @param b Número recibido.
	 * @return Devuelve la resta.
	 * @throws RemoteException Excepción de comunicación.
	 */
	int devolverResta(int a,int b) throws RemoteException;
}