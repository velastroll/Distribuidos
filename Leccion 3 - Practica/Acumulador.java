package utilidades;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import box.Caja;

public class Acumulador implements Serializable{

    private int acumulado;

    public Acumulador(int valorInicial) {
        this.acumulado = valorInicial;
    }
    public int getAcumulado() {
        System.out.println(" DEVUELVE EL ACUMULADO: " + acumulado);
        return acumulado; }
    public int incrementa()   { 
        System.out.println(" AUMENTA EL ACUMULADO: " + acumulado);
        return this.acumulado++; }

}