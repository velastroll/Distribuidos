package UDPServerSession;

import java.net.SocketAddress;

/**
 * Sesion donde almacenamos los datos del contexto que necesitemos.
 * @author cllamas
 */
public class Sesion {

    /** Estos campos los mete porque le da la gana, poor complementar un poco.
     * El contador de sesión nos indica si es la primera, la segunda, la tercera...
     */
    final SocketAddress sa;
    static private int idCounter = 0;

    /** Este es el campo de bit de sesion */
    private final int id;

    /**
     * El SocketAddres guarda la IP y el Puerto.
     * No tiene métodosm simplemente sirve par guardar-
     * @param sa : Guarda el numero de sesion del emisor.
     */
    Sesion(SocketAddress sa) {
        this.sa = sa;
        this.id = ++Sesion.idCounter;
    }

    public int getId() {
        return id;
    }
}
