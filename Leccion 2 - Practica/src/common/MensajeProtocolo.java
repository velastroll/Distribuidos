package common;

import java.util.*;
import java.io.*;

public class MensajeProtocolo implements Serializable {
    private Primitive primitiva;
    private String mensaje ;

    public MensajeProtocolo(Primitive p) {
        /* hemos incluido dos assert por la peligrosidad del constructor
        * recordad que hay que activar expresamente la evaluación
        * de asserts en la JVM */
        assert p.isCompound() == false;

        this.primitiva = p;
        this.mensaje = "";
    }

    public MensajeProtocolo(Primitive p, String m) {
        assert p.isCompound() == true && m != null ;
        this.primitiva = p;
        this.mensaje = m;
    }

    public Primitive getPrimitive() { return this.primitiva; }
    public String getMessage() { return this.mensaje; }

    public String toString() { /* prettyPrinter de la clase */
        String prettyPrint = "["+this.primitiva;
        switch (this.primitiva) {
        case HELLO: ;
        case PUSH: ;
        case PULL_OK:
            return "["+this.primitiva+":"+this.mensaje+"]" ;
        default :
            return "["+this.primitiva+"]" ;
        }
    }
}
