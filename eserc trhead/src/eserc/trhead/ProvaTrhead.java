/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eserc.trhead;

import javax.swing.JOptionPane;

/**
 *
 * @author egliocz
 */
public class ProvaTrhead extends Thread {

    @Override
    public void run() {
           ProvaMutex pm = new ProvaMutex();
           JOptionPane.showMessageDialog(null," che ciutia");
           pm.setX(2);
           int a=pm.get();
           pm.setX(2);
           a=pm.get();
           pm.setX(2);
           a=pm.get();
           pm.setX(2);
           a=pm.get();
           JOptionPane.showMessageDialog(null," intanto");
           JOptionPane.showMessageDialog(null," console scrive numeri");
           JOptionPane.showMessageDialog(null," che vanno da 0");
           JOptionPane.showMessageDialog(null," a 500");
           JOptionPane.showMessageDialog(null," che ciutia!!");
    }
    
}
