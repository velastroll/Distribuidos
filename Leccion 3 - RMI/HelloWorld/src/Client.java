package helloClient;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import helloServer.Hello;
public class Client {
   private Client () { }

   public static void main(String [ ] args) {
      String host = (args.length < 1) ? null : args[0];
      try {
         /* OBSOLETO: Esto está un poco rancio,
            Registry registro = LocateRegistry.getRegistry(host);
            Hello stub = (Hello) registro.lookup(***);
          */

         /** stub = enlace al objeto remoto */
         Hello stub = (Hello) Naming.lookup("rmi://localhost/ObjetoHello");
         System.out.print("\n Ojo que lo coge! \n");
         String respuesta = stub.sayHello();
         System.out.println("[Respuesta: "+respuesta+"]");
      } catch (Exception e) {
         System.err.println("<Cliente: Excepcion: "+e);
         e.printStackTrace();
      }
   }
}