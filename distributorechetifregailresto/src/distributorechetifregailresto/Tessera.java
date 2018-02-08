/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

/**
 *
 * @author egliocz
 */
public class Tessera {
    private int codiceTessera;
    private double credito;

    public Tessera(int codiceTessera, double credito) {
        this.codiceTessera = codiceTessera;
        this.credito = credito;
    }

    public int getCodiceTessera() {
        return codiceTessera;
    }

    public double getCredito() {
        return credito;
    }

    public void setCodiceTessera(int codiceTessera) {
        this.codiceTessera = codiceTessera;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.codiceTessera;
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
        final Tessera other = (Tessera) obj;
        if (this.codiceTessera != other.codiceTessera) {
            return false;
        }
        return true;
    }
    
    
}
