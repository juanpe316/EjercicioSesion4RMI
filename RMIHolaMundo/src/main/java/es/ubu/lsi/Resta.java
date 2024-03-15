package es.ubu.lsi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Realiza una operación de resta.
 */
public class Resta extends UnicastRemoteObject implements InterfazResta{

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor de la clase.
	 * @throws RemoteException
	 */
	protected Resta() throws RemoteException {
		super();
	}
	
	/**
	 * Devuelve la resta.
	 */
	public int devolverResta(int a, int b) throws RemoteException {
		return a-b;
	}
		
}