/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.oop2013.contest2.gruppo11;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Marco
 */
public class Parcheggio {
    
    LinkedList<Veicolo> l = new LinkedList();
    private int riemp = 0;
    
    public Parcheggio() {
        
    }
    
    public void entrataVeicolo(Veicolo v) throws ParcheggioPienoException {
        if (riemp < 5) {
            l.add(v);
            riemp++;
            System.out.println(String.valueOf(riemp));
        } else {
            throw new ParcheggioPienoException("veicolo" +v.getTarga() );
        }        
        
    }
    
    public boolean uscitaVeicolo(Veicolo v) {
        boolean b;
        if (riemp != 0) {
            l.remove(v);
            riemp--;
            return b = true;
        } else {
            return b = false;
        }
    }
    
    public void stampaElenco() {
        System.out.println(l);        
    }
    
    public void stampaElencoUscita() {
        LinkedList<Veicolo> l2 = new LinkedList<Veicolo>();
        l2.addAll(l);
        Collections.sort(l2, new VeicoloComparator());
        for (Veicolo vei : l2) {
            System.out.println(vei.toString());
        }
    }
}
