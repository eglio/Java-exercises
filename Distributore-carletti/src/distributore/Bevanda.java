/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributore;

/**
 *
 * @author egliocz
 */
public class Bevanda implements Comparable<Bevanda> {

    private String codice;
    private String nome;
    private double prezzo;
    private int numero;

    public Bevanda(String codice, String nome, double prezzo, int numero) {
        this.codice = codice;
        this.nome = nome;
        this.prezzo = prezzo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public int compareTo(Bevanda o) {
        return codice.compareTo(o.codice);
    }
}
