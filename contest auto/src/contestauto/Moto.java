    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contestauto;

/**
 *
 * @author egliocz
 */
public class Moto extends Veicolo {

    private boolean guidaLibera;

    public Moto(String numTelaio, String modello, String alimentazione, String targa, boolean guida) {
        super(numTelaio, modello, alimentazione, targa);
        this.guidaLibera = guida;
    }

    public boolean isGuidaLibera() {
        return guidaLibera;
    }

    @Override
    public String toString() {
        return super.toString() + " guida libera=" + guidaLibera;
    }

    public boolean controllaTarga() {
        boolean check = false;
        int i;
        if (super.getTarga().length() != 7) {
            return check;
        }
        for (i = 0; i < 2; i++) {
            if (Character.isAlphabetic(super.getTarga().charAt(i))) {
                check = true;
            } else {
                check = false;
            }
        }
        for (i = 2; i < 7; i++) {
            if (Character.isDigit(super.getTarga().charAt(i))) {
                check = true;
            } else {
                check = false;
            }
        }

        return check;
    }
}