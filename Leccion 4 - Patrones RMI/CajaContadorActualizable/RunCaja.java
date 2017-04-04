package runserver;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import util.*;
import java.rmi.RemoteException;
import cajaserver.*;

/**
 * Lanza el servidor de Caja(s) de Contador(es)
 * @author cllamas
 */
public class RunCaja {
    public static void main(String[] args) {
        try {

            CajaImpl<Contador> cc = new CajaImpl<Contador>();
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("CajaRemota", cc);
            System.out.println("Objeto remoto enlazado");

        } catch (RemoteException re) {
            re.printStackTrace(System.err);
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}