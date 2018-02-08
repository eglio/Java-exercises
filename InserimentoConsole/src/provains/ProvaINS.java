/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package provains;
import java.util.Scanner;

/**
 *
 * @author egliocz
 */
public class ProvaINS {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Inserisci nome: ");
            String nome = s.next();
            System.out.println(nome);
            System.out.println("Inserisci anno: ");
            int anno = s.nextInt();
            System.out.println(anno);
         
        // TODO code application logic here
    }
}
