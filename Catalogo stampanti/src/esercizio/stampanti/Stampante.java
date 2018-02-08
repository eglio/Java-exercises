package esercizio.stampanti;

/**
 *
 * @author egliocz
 */
public class Stampante {

    private String modello;
    private float prezzo;
    private int risoluzione;

    public Stampante(String mod, int ris, float pr) {
        this.modello = mod;
        this.risoluzione = ris;
        this.prezzo = pr;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getRisoluzione() {
        return risoluzione;
    }

    public void setRisoluzione(int risoluzione) {
        this.risoluzione = risoluzione;
    }
}