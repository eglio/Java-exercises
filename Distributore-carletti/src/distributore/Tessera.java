/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributore;

/**
 *
 * @author egliocz
 */
public class Tessera {

    private int codice;
    private double credito;

    public Tessera(int codice, double credito) {
        this.codice = codice;
        this.credito = credito;
    }

    public int getCodice() {
        return codice;
    }

    public double getCredito() {
        return credito;
    }

    public void carica(int credito) {
        this.credito = this.credito + credito;
    }
}