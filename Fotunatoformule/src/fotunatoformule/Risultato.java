/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fotunatoformule;

/**
 *
 * @author egliocz
 */
public class Risultato {

    double[] lamds;
    double[] qq;

    public Risultato(double[] lamds, double[] qq) {
        this.lamds = lamds;
        this.qq = qq;
    }

    public double[] getLamds() {
        return lamds;
    }

    public double[] getQq() {
        return qq;
    }
}
