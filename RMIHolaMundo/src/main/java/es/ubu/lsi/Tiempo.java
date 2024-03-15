package es.ubu.lsi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Clase tiempo, para obtener el tiempo actual.
 */
public class Tiempo extends UnicastRemoteObject implements InterfazTiempo {

	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor Tiempo.
	 * @throws RemoteException
	 */
	protected Tiempo() throws RemoteException {
		super();
	}

	/**
	 * Método que devuelve la hora actual.
	 */
	public String horaActual() throws RemoteException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return dtf.format(LocalDateTime.now());
	}

}
