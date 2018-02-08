/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.thread;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author egliocz
 */
public class LogPrinter implements Runnable {

    private LogSystem ls;

    public LogPrinter(LogSystem ls) {
        this.ls = ls;
    }

    @Override
    public synchronized void run() {
        while (true){
        ArrayList<String> lst = null;
        try {
            lst = (ArrayList) ls.readLog();
        } catch (IOException ex) {
            System.out.println("errore I/O");
        }
        System.out.println("\nLista errori:");
        if(lst.isEmpty()) System.out.println("lista vuota\n");
        for (Iterator<String> it = lst.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
            
        }System.out.println("\n");
        try {
            this.wait(15000);
        } catch (InterruptedException ex) {
            Logger.getLogger(LogPrinter.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
}
