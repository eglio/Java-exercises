/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloswing;

import java.awt.FlowLayout;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

/**
 *
 * @author egliocz
 */
public class Helloswing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        final JFrame frame = new JFrame("hello swing");//crea frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set operazione chiusura
        frame.setSize(200, 300);//dimensione finestra
        frame.setVisible(true);//visibile
        final JButton b1 = new JButton("Button 1");
        final JButton b2 = new JButton("Button 2");
        final JLabel label = new JLabel("ciao");//crea etichetta(testo) -- final per event dispatcher
        frame.add(label);//aggiunge label a finestra
        TimeUnit.SECONDS.sleep(1);//aspetta 1 sec
        label.setText("ciaopergen"); // set testo label
        TimeUnit.SECONDS.sleep(1);//aspetta 1 sec
        //inizio event dispatcher -- classe runnable anonima
        Button2 bt2 = new Button2();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("testo cambiato con event dispatcher");
                frame.setLayout(new FlowLayout());
                frame.add(b1);
                frame.add(b2);
            }
        });
    }
}
