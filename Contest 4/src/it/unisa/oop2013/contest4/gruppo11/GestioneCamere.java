package it.unisa.oop2013.contest4.gruppo11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author gruppo 11
 */
public class GestioneCamere {

    private TreeMap<Camera,Studente> camere;

    /**
     * Inizializza l'oggetto GestioneCamere tramite l'utilizzo di una TreeMap<Camera, Studente>
     */
    public GestioneCamere() {
        camere = new TreeMap();
    }
    
 /**
     *Create a new association <tm>Camera</tm> - <tm>Studente</tm> to add it in the underlying data structure.
     * If the Camera is already assigned, this method shows an error message.
     * @param cam
     * @param st
     */
    public void assegnaCamera(Camera cam, Studente st) {
        if(!camere.containsKey(cam)){
           camere.put(cam, st);
        }else{JOptionPane.showMessageDialog(null,"Camera già occupata","Attenzione",JOptionPane.WARNING_MESSAGE);}
        
    }

    
    /**
     *Removes an association <em>Camera</em> - <em>Studente</em> from the underlying data structure.
     * <br>
     * This method checks if the camera is already assigned and shows an error message.<br>
     * Otherwise removes the association matched by the field of the Key passed as a parameter.
     * @param numero
     */
    public void rimuoviCamera(int numero) {
        Camera tmp=null;
        Set<Map.Entry<Camera, Studente>> entries = camere.entrySet();
        for (Map.Entry<Camera, Studente> entry : entries) {
            if (entry.getKey().getNumero() == numero) {
                tmp=entry.getKey();
           }
        }
        if (tmp==null) JOptionPane.showMessageDialog(null, "Camera non assegnata", "Attenzione", JOptionPane.WARNING_MESSAGE);
        else camere.remove(tmp);
            
    }
    
     /**
     * Reads objects from the specified file
     * @param file
     * 
     */
    public void leggiFile(File file){
     ObjectInputStream load = null;
    
     try {
                load = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                this.camere = (TreeMap<Camera, Studente>) load.readObject(); 
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Il file selezionato è illeggibile!", "errore", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    load.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Errore durante la chiusura del file", "errore", JOptionPane.ERROR_MESSAGE);
            }
     }}
    
    /**
     *Saves the objects on the specified file
     * @param file
     */
    public void salvaFile(File file){
        ObjectOutputStream save = null;
    try {
                save = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                save.writeObject(camere);
                JOptionPane.showMessageDialog(null, "File salvato con successo");
            
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Errore durante il salvataggio del file", "errore", JOptionPane.ERROR_MESSAGE);
            } finally {
                try {
                    save.close();
                } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "Errore durante la chiusura", "errore", JOptionPane.ERROR_MESSAGE);
             }
            }
    }

    /**
     *Returns the string containig the complete list of the associations in the underlying data structure.
     * @return String - a string with all the associations
     */
    public String toString() {
        String stato="";
        Set<Map.Entry<Camera,Studente>> set = camere.entrySet();
        for (Iterator<Map.Entry<Camera, Studente>> it = set.iterator(); it.hasNext();) {
            Map.Entry<Camera,Studente> corrente  = it.next();
            stato = stato + "Cam: "+corrente.getKey().getNumero()+" Piano: "+corrente.getKey().getPiano()+" - "+corrente.getValue().getNome()+" "+corrente.getValue().getCognome()+" ("+corrente.getValue().getNazionalita()+")\n";
        }
        return stato;}
       
    /**
     *Calculates the final amount of money to be payed
     * @param prezzo - the unified price for each chamber
     * @return double - the total payment of the chambers
     */
    public double calcolaTotale(double prezzo) {
        return camere.size()*prezzo;
    }
}
