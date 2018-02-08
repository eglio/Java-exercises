/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributore;

import distributore.eccezioni.BevandaEsaurita;
import distributore.eccezioni.TesseraNonValida;

/**
 *
 * @author egliocz
 */
public class TestDitstrib {

    

    public static void  main(String args[]) {
    Distributore dis = new Distributore();
        Bevanda acq = new Bevanda("aq", "acqua", 1.0, 2);
        Bevanda peps = new Bevanda("pps", "pepsi", 2.0, 2);
        Bevanda coca = new Bevanda("ccl", "coca-cola", 1.5, 2);
        Bevanda birr = new Bevanda("br", "birra", 2.5, 2);
        dis.caricaBevanda(acq);
        dis.caricaBevanda(peps);
        dis.caricaBevanda(coca);
        dis.caricaBevanda(birr);

        Tessera tes = new Tessera(0, 0.0);
        dis.registraTessera(tes);

        try {
            dis.caricaTessera(tes, (int) 25.0);
        } catch (TesseraNonValida e) {
            System.out.println("Tessera non valida!!");
        }

        System.out.println("sono rimaste" + String.valueOf(dis.lattineDisponibili()) + " bevande!");
        try {
            dis.leggiCredito(tes.getCodice());
        } catch (TesseraNonValida x) {
            System.out.println("Tessera non valida");
        }

        try {
            Bevanda be = dis.erogaProdotto("acqua", "aq");
            System.out.println("ecco la tua "+be.getNome());
        } catch (BevandaEsaurita c) {
            System.out.println("Bevanda esaurita!");
        }
    }
}

