/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contestauto;

/**
 *
 * @author egliocz
 */
public class Autovettura extends Veicolo {

    int numeroPosti;

    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int posti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti = posti;
    }

    ;

    @Override
    public String toString() {
        return super.toString() + " numero posti=" + numeroPosti;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }
    
     public boolean controllaTarga() {
        boolean check = false;
        int i;
        if (super.getTarga().length() != 7) {
            return check;
        }
        for (i = 0; i < 2; i++) {
            if (Character.isAlphabetic(super.toString().charAt(i))) {
                check = true;
            } else {
                check = false;
            }
        }
        for (i = 2; i < 5; i++) {
            if (Character.isDigit(super.toString().charAt(i))) {
                check = true;
            } else {
                check = false;
            }
        }
        for (i = 5; i < 7; i++) {
            if (Character.isAlphabetic(super.getTarga().charAt(i))) {
                check = true;
            } else {
                check = false;
            }
        }

        return check;
    }
}
