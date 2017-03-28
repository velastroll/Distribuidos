package box;

import java.rmi.Remote;
import java.rmi.RemoteException;
import utilidades.*;
public interface Caja extends Remote{
    public void guarda(Acumulador ac) throws RemoteException;
    public Acumulador recupera() throws RemoteException;
}