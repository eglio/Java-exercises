/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.stampanti;

/**
 *
 * @author egliocz
 */
public class EsercizioStampanti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Catalogo c = new Catalogo();
        Stampante s = new Stampante("hp01",100,80);
        c.inserisci("hp", s);
        c.cercaPerCodice("hp");
        c.cercaPerPrezzo(20, 5000);
        c.rimuovi("hp");
        System.exit(0);
        
    }
}
