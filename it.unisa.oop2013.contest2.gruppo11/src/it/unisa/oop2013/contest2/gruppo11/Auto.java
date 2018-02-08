package it.unisa.oop2013.contest2.gruppo11;

/**
 *
 * @author antonio
 */
public class Auto extends Veicolo {

    public Auto(String targa, int oraUscita) {
        super(targa, oraUscita);
    }

    @Override
    public String toString() {
        return "Veicolo: AUTO, Targa: [" + getTarga() + "], Ora prevista di uscita: [" + String.valueOf(getOraUscita()) + "]\n";
    }
}
