/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.stampanti;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author egliocz
 */
public class Catalogo {

    private Map<String, Stampante> map;

    public Catalogo() {
        this.map = new HashMap<>();
    }

    public Stampante inserisci(String cod, Stampante prodotto) {
        return map.put(cod, prodotto);
    } //put inserisce chiave-valore, se c'eragià chiave ritorna valore vecchio,else null

    public Stampante rimuovi(String codice) {
        return map.remove(codice); //ritorna valore rimosso, se non presente NULL     
    }

    public Stampante cercaPerCodice(String codice) {
        return map.get(codice);
    }

    public Collection<Stampante> cercaPerPrezzo(int prezzoMin, float prezzoMax) {
        //ENTRYSET rende set ITERABILE
        LinkedList<Stampante> l = null;
        Map.Entry<String,Stampante> entry;
        Set<Map.Entry<String, Stampante>> entries = map.entrySet(); //set di entries composti da K,V
        Iterator<Map.Entry<String,Stampante>> i = entries.iterator();
        while(i.hasNext()){
            entry=i.next();
            float prezzo = entry.getValue().getPrezzo();
            if(prezzo>=prezzoMin && prezzo<= prezzoMax){l.add(entry.getValue());}
        }
        //TO-DO
        return l;
    }
}
