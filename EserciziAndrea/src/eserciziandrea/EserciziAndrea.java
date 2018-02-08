/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eserciziandrea;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author egliocz
 */

public class EserciziAndrea {
    private static class Merda extends Exception{}
     public static void main(String[] args) throws Merda {
     Scanner s = new Scanner(System.in);
     System.out.println("Inserisci numero");
     int val = s.nextInt();
         for (int i = 0; i < val; i++) {
             System.out.println("il quadrato di "+i+"è "+i*i);             
         }throw new Merda();
         //System.exit(0); 
         
    }
     
    
    
}
