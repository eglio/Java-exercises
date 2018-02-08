/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eserc.trhead;

/**
 *
 * @author egliocz
 */
public class ProvaMutex {
    private int x;

    /**/
    public synchronized int get() {
        return x;
    }

    public synchronized void setX(int x) {
        this.x = x;
    }
    
    
    
}
