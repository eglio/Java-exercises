/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

import java.util.Objects;

/**
 *
 * @author egliocz
 */
public class Bevanda {
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

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bevanda other = (Bevanda) obj;
        if (!Objects.equals(this.codice, other.codice)) {
            return false;
        }
        return true;
    }
    
    
}
