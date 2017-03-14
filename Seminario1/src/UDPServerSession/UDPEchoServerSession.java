package UDPServerSession;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * UDPEchoServerSession mantiene la sesión en función del origen
 *                      del datagrama.
 * @author cllamas
 */
public class UDPEchoServerSession {
  static final int BUFFERSIZE = 256;
  static final HashMap<SocketAddress,Sesion> sesiones = new HashMap();
 
 /** Si llega una sesión que no tenemos guardada, se anade, en caso de que ya esté, pues se abre. */
  public static void main(String[] args) {
    DatagramSocket sock;
    try {
      sock = new DatagramSocket(1919);
    } catch (SocketException e) {
      System.out.println(e);
      return;
    }
    // echo de todo sin importar el origen.
    while (true) {
      try {
        DatagramPacket pack = new DatagramPacket(new byte[BUFFERSIZE], BUFFERSIZE);
    
        sock.receive(pack);
        Sesion s;

        /** Si no está guardada (null) pues se implementa. */
        if ((s = sesiones.get(pack.getSocketAddress())) == null) {
            s = new Sesion(pack.getSocketAddress());
            sesiones.put(pack.getSocketAddress(), s);
        }
        System.out.println("Sesion: "+s.getId());

        System.out.println("<"+s.getId()+">["
                +pack.getAddress().getHostAddress()+":"+pack.getPort()+"] "+
                (new String(pack.getData())));
        sock.send(pack);
      } catch (IOException ioe) {
        System.out.println(ioe);
      }
    }
  }
}