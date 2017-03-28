package client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import box.Caja;
import utilidades.Acumulador;
public class ClienteGuarda {
   private ClienteGuarda () { }

   public static void main(String [ ] args) {
      String host = (args.length < 1) ? null : args[0];
      try {
         /**
          * Obtenemos la referencia al objeto caja y guardamos un acumulador con el número 10.
          */
         Caja stub = (Caja) Naming.lookup("rmi://localhost/CajaObjeto");
         Acumulador ac = new Acumulador(10);
         System.out.print("\n Enviando objeto a la caja remota... ");
         stub.guarda(ac);
         System.out.print("Listo.\n");

      } catch (Exception e) {
         System.err.println("\t<Cliente: Excepcion: "+e);
         e.printStackTrace();
      }
   }
}