package it.unisa.oop2013.contest1.gruppo11;

/**
 *
 * @author antonio
 */
public class Multifunzione extends Stampante {

    public Multifunzione(String modello, String marca) {
        super(modello, marca);
    }

    public void acquisisciImmagine() {
        //Generazione numero random a 3 cifre come richiesto dalla traccia
        int peso = (int) (Math.random() * 899 + 100);
        System.out.println("\nAcquisizione immagine: dimensione " + peso + " kb");

    }
}
