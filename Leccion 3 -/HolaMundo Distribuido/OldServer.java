/**
 * Esta guay probar todo en el mismo proyecto con RMI, pero en cuanto veamos que funciona, es mejor meter el cliente y el servidor en diferentes proyectos, para asi asemejar que son dos maquinas diferentes.
 */

package helloServer;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OldServer implements Hello {

    public OldServer() {}

	@Override
    public String sayHello() throws RemoteException{
	return "Hello, world!";
    }

    public static void main(String args[]) {

	try {
	    OldServer obj = new OldServer();
	    Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);

	    // Bind the remote object's stub in the registry
	    Registry registry = LocateRegistry.getRegistry();
		/** 
		 * Ya no controlamos el programa con un bucle, ya no somos los jefes,
		 * ahora el que manda es el RMI, el que manda es el cliente, que es
		 * el que invoca los objetos remotos.
		 */
	    registry.bind("Hello", stub);

	    System.err.println("Old version Server ready");
	} catch (Exception e) {
	    System.err.println("Server exception: " + e.toString());
	    e.printStackTrace();
	}
    }
}