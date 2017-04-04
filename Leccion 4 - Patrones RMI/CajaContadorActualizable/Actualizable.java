package util;
import java.rmi.RemoteException;


@FunctionalInterface
public interface Actualizable{
    public void actualiza() throws RemoteException, cajaserver.CajaVaciaException;
}