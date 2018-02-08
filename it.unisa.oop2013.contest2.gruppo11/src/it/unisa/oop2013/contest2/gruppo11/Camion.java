/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.oop2013.contest2.gruppo11;

/**
 *
 * @author egliocz
 */
public class Camion extends Veicolo {

    private String targaRimorchio;

    public void setTargaRimorchio(String targaRimorchio) {
        this.targaRimorchio = targaRimorchio;
    }

    public Camion(String targa, String targaRimorchio, int oraUscita) {
        super(targa, oraUscita);
        this.targaRimorchio = targaRimorchio;
    }

    @Override
    public String toString() {
        return "Veicolo: CAMION, Targa: " + this.getTarga() + ", Targa rimorchio: " + targaRimorchio + ", Ora prevista di uscita: " + String.valueOf(this.getOraUscita());
    }
}
