/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fotunatoformule;

/**
 *
 * @author egliocz
 */
public class Calcolator {

    float pi = (float) 3.14;
    float g = (float) 9.8;
    double ecsilons[] = new double[8];
    double ds[] = new double[8];
    double js[] = new double[8];
    double nis[] = new double[8];
    double lambdas[] = new double[8];
    double qs[] = new double[8];

    public Risultato calcola() {
        this.inizializza();

        {//calcolo lambda
            for (int i = 0; i < 8; i++) {
                double denom1 = ecsilons[i] / (3.7 * ds[i]);
                double denom2 = (0.57 * nis[i]) / ((Math.pow(js[i], 0.5) * Math.pow(ds[i], 1.5)));
                double denom = Math.pow(Math.log10(denom1+denom2),2);
                lambdas[i] = 0.25 / (denom);
            }
        }

        {//calcolo Q
            for (int i = 0; i < 8; i++) {
                double tmp = g * Math.pow(pi, 2);
                double q1 = Math.pow(tmp / (8 * lambdas[i]), 0.5);
                double q2 = Math.sqrt(js[i] * Math.pow(ds[i], 5));
                qs[i] = q1 * q2;
            }
        }

        /*  System.out.println("\n\ncheck 8");
         System.out.println("ecs "+ecsilons[7]);
         System.out.println("d "+ds[7]);
         System.out.println("j "+js[7]);
         System.out.println("ni "+nis[7]);*/

        return new Risultato(lambdas, qs);

    }

    private void inizializza() {
        //gruppo 1
        ecsilons[0] = 0.1E-3;
        ds[0] = 200E-3;
        js[0] = 1E-3;
        nis[0] = 1E-6;

        //gruppo 2
        ecsilons[1] = 0.1E-3;
        ds[1] = 200E-3;
        js[1] = 1E-4;
        nis[1] = 1E-6;

        //gruppo 3
        ecsilons[2] = 0.1E-3;
        ds[2] = 400E-3;
        js[2] = 1E-3;
        nis[2] = 1E-6;

        //gruppo 4
        ecsilons[3] = 0.1E-3;
        ds[3] = 400E-3;
        js[3] = 1E-4;
        nis[3] = 1E-6;

        //gruppo 5
        ecsilons[4] = 1E-3;
        ds[4] = 200E-3;
        js[4] = 1E-3;
        nis[4] = 1E-6;

        //gruppo 6
        ecsilons[5] = 1E-3;
        ds[5] = 200E-3;
        js[5] = 1E-4;
        nis[5] = 1E-6;

        //gruppo 7
        ecsilons[6] = 1E-3;
        ds[6] = 400E-3;
        js[6] = 1E-3;
        nis[6] = 1E-6;

        //gruppo 8
        ecsilons[7] = 1E-3;
        ds[7] = 400E-3;
        js[7] = 1E-4;
        nis[7] = 1E-6;

    }
}
