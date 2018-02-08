    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fotunatoformule;

/**
 *
 * @author egliocz
 */
public class cALCOLATOR2 {

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
                double tmp = Math.pow((5.95*nis[i]*ds[i])/qs[i], 0.9);
                double tmp2 = ecsilons[i]/3.7*ds[i];
                double denom = Math.pow(Math.log10(tmp+tmp2), 2);
                lambdas[i]=0.25/denom;
            }
        }

        {//calcolo j
            for (int i = 0; i < 8; i++) {
                double tmp1 = (8 * lambdas[i]) / (g * Math.pow(pi, 2));
                double tmp2 = Math.pow(qs[i], 2) / Math.pow(ds[i], 2);
                js[i] = tmp1 * tmp2;

            }
        }

        /*  System.out.println("\n\ncheck 8");
         System.out.println("ecs "+ecsilons[7]);
         System.out.println("d "+ds[7]);
         System.out.println("j "+js[7]);
         System.out.println("ni "+nis[7]);*/

        return new Risultato(lambdas, js);

    }

    private void inizializza() {
        //gruppo 1
        ecsilons[0] = 0.1E-3;
        ds[0] = 200E-3;
        qs[0] = 25E-3;
        nis[0] = 1E-6;

        //gruppo 2
        ecsilons[1] = 0.1E-3;
        ds[1] = 200E-3;
        qs[1] = 50E-3;
        nis[1] = 1E-6;

        //gruppo 3
        ecsilons[2] = 0.1E-3;
        ds[2] = 400E-3;
        qs[2] =25E-3;
        nis[2] = 1E-6;

        //gruppo 4
        ecsilons[3] = 0.1E-3;
        ds[3] = 400E-3;
        qs[3] = 50E-3;
        nis[3] = 1E-6;

//gruppo 5
        ecsilons[4] = 1E-3;
        ds[4] = 200E-3;
        qs[4] = 25E-3;
        nis[4] = 1E-6;

        //gruppo 6
        ecsilons[5] = 1E-3;
        ds[5] = 200E-3;
        qs[5] = 50E-3;
        nis[5] = 1E-6;

        //gruppo 7
        ecsilons[6] = 1E-3;
        ds[6] = 400E-3;
        qs[6] = 25E-3;
        nis[6] = 1E-6;

        //gruppo 8
        ecsilons[7] = 1E-3;
        ds[7] = 400E-3;
        qs[7] = 50E-3;
        nis[7] = 1E-6;


    }
}
