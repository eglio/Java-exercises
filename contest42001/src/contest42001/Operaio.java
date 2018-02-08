/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contest42001;

/**
 *
 * @author egliocz
 */
public class Operaio {
    private int matricola;
    private String nome, Cognome;
    private int ore;

    public Operaio(int matricola, String nome, String Cognome, int ore) {
        this.matricola = matricola;
        this.nome = nome;
        this.Cognome = Cognome;
        this.ore = ore;
    }

    public int getMatricola() {
        return matricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public int getOre() {
        return ore;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.matricola;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operaio other = (Operaio) obj;
        if (this.matricola != other.matricola) {
            return false;
        }
        return true;
    }
    
    
    
}
