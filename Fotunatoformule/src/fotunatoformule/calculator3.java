/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fotunatoformule;

/**
 *
 * @author egliocz
 */
public class calculator3 {
    
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

        {//calcolo di
            for (int i = 0; i < 8; i++) {
                double tmp= ((1/1.8)*(ecsilons[i]*Math.pow(js[i], 0.2)/Math.pow(qs[i], 0.4)));
                double tmp2 = (3.8*nis[i])/((Math.pow(js[i], 0.2))*Math.pow(qs[i], 0.6));
                double denom = Math.pow(Math.log10(tmp+tmp2), 2);
                lambdas[i]=0.25/denom;
                //System.out.println(lambdas[i]);
                
            }
        }

        {//calcolo ds
            for (int i = 0; i < 8; i++) {
                double tmp1 = Math.pow((8 * lambdas[i]) / (g * Math.pow(pi, 2)),0.2);
                double tmp2 = Math.pow(qs[i], 0.4) / Math.pow(js[i], 0.2);
                ds[i] = tmp1 * tmp2;
                //System.out.println(js[i]);
            }
        }

        /*  System.out.println("\n\ncheck 8");
         System.out.println("ecs "+ecsilons[7]);
         System.out.println("d "+ds[7]);
         System.out.println("j "+js[7]);
         System.out.println("ni "+nis[7]);*/

        return new Risultato(lambdas, ds);

    }

    private void inizializza() {
        //gruppo 1
        ecsilons[0] = 0.1E-3;
        js[0] = 10E-3;
        qs[0] = 25E-3;
        nis[0] = 1E-6;

        //gruppo 2
        ecsilons[1] = 0.1E-3;
        js[1] = 10E-3;
        qs[1] = 50E-3;
        nis[1] = 1E-6;

        //gruppo 3
        ecsilons[2] = 0.1E-3;
        js[2] = 10E-3;
        qs[2] =25E-3;
        nis[2] = 1E-6;

        //gruppo 4
        ecsilons[3] = 0.1E-3;
        js[3] = 10E-3;
        qs[3] = 50E-3;
        nis[3] = 1E-6;

//gruppo 5
        ecsilons[4] = 1E-3;
        js[4] = 10E-4;
        qs[4] = 25E-3;
        nis[4] = 1E-6;

        //gruppo 6
        ecsilons[5] = 1E-3;
        js[5] = 10E-4;
        qs[5] = 50E-3;
        nis[5] = 1E-6;

        //gruppo 7
        ecsilons[6] = 1E-3;
        js[6] = 10E-4;
        qs[6] = 25E-3;
        nis[6] = 1E-6;

        //gruppo 8
        ecsilons[7] = 1E-3;
        js[7] = 10E-4;
        qs[7] = 50E-3;
        nis[7] = 1E-6;
    }
}
