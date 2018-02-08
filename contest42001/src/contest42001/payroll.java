/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contest42001;

import java.util.LinkedHashSet;

/**
 *
 * @author egliocz
 */
public class payroll {
    private int costoh;
    private LinkedHashSet<Operaio> set;

    public payroll() {
        this.costoh = 0;
        this.set = new LinkedHashSet<>();
    }

    public int getCostoh() {
        return costoh;
    }
    
    public void aggiungiop(Operaio op){
        set.add(op);        
    }
    
    public void rimuoviop(Operaio op){}
    
    
}
