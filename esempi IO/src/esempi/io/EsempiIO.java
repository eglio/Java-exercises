/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esempi.io;

import java.io.*;

/**
 *
 * @author egliocz
 */
public class EsempiIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       DataInputStream cons = new DataInputStream(System.in);
       PrintWriter pw =new PrintWriter (System.out);
       int intero = 100;
       pw.print(intero);
       intero = cons.readInt();
       pw.print(intero);
    }
}
