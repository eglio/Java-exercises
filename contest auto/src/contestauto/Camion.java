/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contestauto;

/**
 *
 * @author egliocz
 */
public class Camion extends Veicolo {

    private int numeroAssi;

    public Camion(String numTelaio, String modello, String alimentazione, String targa, int assi) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi = assi;
    }

    public int getNumeroAssi() {
        return numeroAssi;
    }

    @Override
    public String toString() {
        return super.toString() + " numero assi = " + numeroAssi;
    }

    public boolean controllaTarga() {
        boolean check = false;
        int i=0;
        if (super.getTarga().length() != 8)  return false;
        
        while (i < 2) {
            if (Character.isAlphabetic(super.getTarga().charAt(i))) {
                check = true;
            } else {
                return false;
            }
        i++;}
        while (i < 8) {
            if (Character.isDigit(super.getTarga().charAt(i))) {
                check = true;
            } else {
                return false;
            }
        i++;}

        return check; 
    }
}

