package launch;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import box.Cajaimpl;
import utilidades.Acumulador;

public class Lanzador extends UnicastRemoteObject {

   public Lanzador() throws RemoteException { }

   public static void main(String [ ] args) {
      try {

          /**
           * Creamos una Caja (oRemoto) que lanzaremos a 'localhost'.
           */
         Cajaimpl oRemoto = new Cajaimpl();
         Registry registro = LocateRegistry.getRegistry("localhost");

         /* El objeto será lanzado bajo la referencia 'CajaObjeto'.
          */
         registro.rebind("CajaObjeto", oRemoto);
         //registro.rebind("CajaObjeto2", oRemoto);
         System.err.print("-- LANZADOR PREPARADO --\n");

      } catch (Exception e) {
         System.err.println("Excepción del lanzador: "+e.toString());
         e.printStackTrace();
      }
   }
}