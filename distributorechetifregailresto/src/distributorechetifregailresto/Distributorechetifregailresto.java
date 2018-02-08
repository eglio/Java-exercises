/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

import distributore.eccezioni.BevandaEsaurita;
import distributore.eccezioni.BevandaNonValida;
import distributore.eccezioni.CreditoInsufficiente;
import distributore.eccezioni.TesseraNonValida;

/**
 *
 * @author egliocz
 */
public class Distributorechetifregailresto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BevandaNonValida, TesseraNonValida, BevandaEsaurita, CreditoInsufficiente {

        Distributore d = new Distributore();
        d.registraTessera(new Tessera(0,10.0));
        System.out.println("tessera 0, 10€");
        d.registraTessera(new Tessera(1,2.0));
        System.out.println("tessera 1, 2€");
        d.registraBevanda(new Acqua("liscia","acq","lete",1.0,5));
        System.out.println("1 acqua 1€, cod acq");
        d.registraBevanda(new Birra("chiara","bir","nastro",1.0,1));
        System.out.println("1 birra 1€, cod bir");
        d.registraBevanda(new CocaCola("zero","coca","ccl",1.0,1));
        System.out.println("1 cola 1€, cod coca");
        d.registraBevanda(new Pepsi("sessantasei","pep","pps",1.0,1));
        System.out.println("1 pepsi 1€, cod pep");
        d.caricaTessera(0, 1);
         System.out.println("tessera0 + 1€");
         d.caricaTessera(1, 1);
         System.out.println("tessera1 + 1€");
         Integer tmp = d.lattineDisponibili("acq");
         System.out.println("ci sono acqua " + tmp.toString());
         Double dbl =d.leggiCredito(1);
         System.out.println("tessera 1 €" + dbl.toString());
         d.erogaProdotto("acq", 1);
         tmp = d.lattineDisponibili("acq");
         System.out.println("ci sono acqua " + tmp.toString());
         System.out.println("tessera 1 ha preso 1 acqua");
         System.out.println("ci sono acqua " + tmp.toString());
         dbl =d.leggiCredito(1);
         System.out.println("tessera 1 €" + dbl.toString());
         System.out.println("UCCIDI");
         //tesseranonvalida ok
         //bevanda non valida OK
         //bevanda esaurita  OK
         //credito insufficiente OK
    }
}