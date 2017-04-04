package cajaserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.io.Serializable;

/**
 * Almacena un dato accesible vía RMI.
 * (Versión incompleta)
 *
 * El dato persiste en el servidor hasta que un cliente lo sobreescribe.
 * @author cllamas
 * @param <T> es el tipo de dato que guardamos en la Caja
 */
public interface Caja<T extends java.io.Serializable> extends java.rmi.Remote {

    /**
     * Sobreescribe el dato en la caja.
     * @param a el dato pasa a ser el contenido actual de la caja.
     * @throws ...
     */
    public void pon(T a) throws java.rmi.RemoteException;

    /**
     * Retira el contenido de la caja y la vacía.
     * @return el contenido actual de la caja.
     * @throws RemoteException
     */
    public T quita() throws java.rmi.RemoteException;

    /**
     * Consulta el contenido de la caja.
     * @return el contenido actual de la caja.
     * @throws RemoteException
     */
    public T lee() throws java.rmi.RemoteException;
    

    /**
     * Actualiza el contenido de la caja.
     * @return el contenido actual de la caja.
     * @throws RemoteException
     */    
   // public void actualiza() throws RemoteException, CajaServerException;

}