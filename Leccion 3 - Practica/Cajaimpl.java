package box;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import utilidades.Acumulador;

public class Cajaimpl extends UnicastRemoteObject implements Caja{


    Acumulador acumulado;
   public Cajaimpl() throws RemoteException { 
       acumulado = null;
   }

   @Override
   public void guarda(Acumulador ac) throws RemoteException{
        acumulado = ac;
   }

   @Override
   public Acumulador recupera() throws RemoteException{
       Acumulador acl = this.acumulado;
       this.acumulado = null;
       return acl;
   }
}