/**
 * Esta guay probar todo en el mismo proyecto con RMI, pero en cuanto veamos que funciona, es mejor meter el cliente y el servidor en diferentes proyectos, para asi asemejar que son dos maquinas diferentes.
 */

package helloClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class OldClient {

    private OldClient() {}

    public static void main(String[] args) {

	String host = (args.length < 1) ? null : args[0];
	try {
	    Registry registry = LocateRegistry.getRegistry(host);
	    Hello stub = (Hello) registry.lookup("Hello");
	    String response = stub.sayHello();
	    System.out.println("response: " + response);
	} catch (Exception e) {
	    System.err.println("Client exception: " + e.toString());
	    e.printStackTrace();
	}
    }
}