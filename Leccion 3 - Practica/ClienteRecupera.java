package client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import box.Caja;
import utilidades.Acumulador;
public class ClienteRecupera{
   private ClienteRecupera () { }

   public static void main(String [ ] args) {
      String host = (args.length < 1) ? null : args[0];
      try {
         /**
          * Obtenemos la referencia al objeto caja y recuperamos un acumulador con el número 10.
          */
         Caja stub = (Caja) Naming.lookup("rmi://localhost/CajaObjeto");
         Acumulador ac = stub.recupera();

         if (ac == null) {System.out.print("\n -- No hay nigun objeto guardado. --\n");}
         else {
             System.out.print("\n Recuperamos el objeto... ");
             int acum = ac.getAcumulado();
        }
      } catch (Exception e) {
         System.err.println("<Cliente: Excepcion: "+e);
         e.printStackTrace();
      }
   }
}