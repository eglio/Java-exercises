/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio.io;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author egliocz
 */
public class Rubrica {

    Set<Persona> contatti = new TreeSet<>();

    public void aggiungiConntatto(Persona p) {
        contatti.add(p);
    }

    public void rimuoviContatto(String nome, String cognome) {
        for (Persona p : contatti) {
            if (p.getNome().equalsIgnoreCase(nome) && p.getCognome().equalsIgnoreCase(cognome)) {
                contatti.remove(p);
            }
        }
    }

    @Override
    public String toString() {
        return "elenco contatti:\n" + contatti;
    }

    public Persona cercaPersona(String nome, String cognome) {
        Persona tmp = null;
        for (Persona p : contatti) {
            if (p.getNome().equalsIgnoreCase(nome) && p.getCognome().equalsIgnoreCase(cognome)) {
                tmp = p;
            }
        }
        return tmp;
    }

    /**returns a collection of Personas with matching arg Cognome*/
    public Collection<Persona> cercaPersona(String cognome) throws PersonaNonPresenteException{
        Set<Persona> s = new TreeSet<>();
        for (Persona p : contatti) {
            if (p.getCognome().equalsIgnoreCase(cognome)) {
                s.add(p);
            }
        }
        return s;

    }
   
}
