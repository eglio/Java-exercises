package it.unisa.oop2013.contest1.gruppo11;

/**
 *
 * @author Marco
 */
public class Fax extends Multifunzione {

    private String numeroDiTelefono;

    public Fax(String modello, String marca, String numeroDiTelefono) {
        super(modello, marca);
        this.numeroDiTelefono = numeroDiTelefono;

    }

    public String inviaFax(String testo) {
        return ("Numero di telefono: "+numeroDiTelefono + "\nTesto: " + testo);
    }
}
