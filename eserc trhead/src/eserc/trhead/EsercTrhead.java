/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eserc.trhead;

/**
 *
 * @author egliocz
 */
public class EsercTrhead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProvaMutex  pm= new ProvaMutex();
        Thread nt = new ProvaTrhead();
        nt.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            
        }
        int a = 0;
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
       pm.setX(2);
       a=pm.get();
        for (int i = 0; i <500; i++) {
            System.out.println(i);
            
        }
    }
}
