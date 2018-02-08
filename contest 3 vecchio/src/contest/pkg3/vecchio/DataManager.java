/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package contest.pkg3.vecchio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author egliocz
 */
public class DataManager {

    private LinkedHashMap<Persona, Dono> mp;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public DataManager() throws FileNotFoundException, IOException {
        this.in = new ObjectInputStream(new FileInputStream("regali.txt"));
        this.out = new ObjectOutputStream(new FileOutputStream("regali.txt"));
    }

    public synchronized void emptyData() {
        mp = new LinkedHashMap<>();
    }

    public synchronized void addDono(Persona p, Dono d) {
        mp.put(p, d);
    }

    public synchronized Dono removeDono(Persona p) throws NotFoundException {
        Dono remove = mp.remove(p);
        if (remove == null) {
            throw new NotFoundException();
        } else {
            return remove;
        }
    }

    public synchronized void fileSave() throws IOException {
        out.writeObject(mp);
        JOptionPane.showMessageDialog(null, "dati salvati");
    }

    public synchronized void fileLoad() throws IOException, ClassNotFoundException {
        this.mp = (LinkedHashMap) in.readObject();
        JOptionPane.showMessageDialog(null, "dati caricati");
    }

    public synchronized void printer() {
        System.out.println(mp.toString());
    }
}
