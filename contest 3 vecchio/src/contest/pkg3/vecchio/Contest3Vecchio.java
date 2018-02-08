/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contest.pkg3.vecchio;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author egliocz
 */
public class Contest3Vecchio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, NotFoundException, InterruptedException {
        // TODO code application logic here
        DataManager dati = new DataManager();
        String scelta = JOptionPane.showInputDialog("SCEGLI:\n1- crea inssieme vuoto\n2- carica da file\n3- salva su file\n4- aggiungi dati\n5-rimuovi dato\n6-visualizza dati\n7-esci");
        int sel = Integer.parseInt(scelta);

        switch (sel) {
            case 1:
                dati.emptyData();
                JOptionPane.showMessageDialog(null, "dati inizializzati");
                break;
            case 2:
                dati.fileLoad();
                JOptionPane.showMessageDialog(null, "dati caricati");
                break;
            case 3:
                dati.fileSave();
                JOptionPane.showMessageDialog(null, "file salvato");
                break;
            case 4:
                String nome = JOptionPane.showInputDialog("inserisci nome");
                String cog = JOptionPane.showInputDialog("inserisci cognome");
                String reg = JOptionPane.showInputDialog("inserisci nome regalo");
                dati.addDono(new Persona(nome, cog), new Dono("reg", 10));
                JOptionPane.showMessageDialog(null, nome + " aggiunto");
                break;
            case 5:
                String tmpnome = JOptionPane.showInputDialog("inserisci nome");
                String tmpcog = JOptionPane.showInputDialog("inserisci cognome");
                Dono rimosso = dati.removeDono(new Persona(tmpnome, tmpcog));
                JOptionPane.showMessageDialog(null, rimosso.getProdotto() + " rimosso");
                break;
            case 6:
                dati.printer();
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "ciao pergen!");
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.exit(1);

        }
    }
}
