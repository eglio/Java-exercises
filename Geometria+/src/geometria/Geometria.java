/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author egliocz
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        final JFrame mainf = new JFrame("matematica");
        mainf.setSize(200, 300);
        mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainf.setVisible(true);
        final JButton rufb = new JButton("Ruffini");
        final JButton matr = new JButton("matrici");
        final JLabel titolo = new JLabel("cosa vuoi fare?");
      
                SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainf.setLayout(new FlowLayout());
                mainf.add(titolo);
                mainf.add(rufb);
                mainf.add(matr);
                
                mainf.setSize(150, 150);
            }});
         rufb.addActionListener(new RuffiniListener(mainf));
         matr.addActionListener(new MatListener());
    }}
        
        // TODO code application logic here

        /*
        */

//Thread.sleep(500);

    

