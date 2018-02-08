package it.unisa.oop2013.contest1.gruppo11;

/**
 *
 * @author egliocz
 */
public class Stampante {

    private String modello;
    private String marca;

    public Stampante(String mod, String mar) {
        this.modello = mod;
        this.marca = mar;
    }

    public String getModello() {
        return modello;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return ("Marca: " + getMarca() + " - Modello: " + getModello());
    }
}
