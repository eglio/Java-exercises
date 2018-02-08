/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author egliocz
 */
public class MatListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        final JFrame frame = new JFrame("Matrici");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(100, 200);
        frame.setLayout(new FlowLayout());
        final JTextField m1 = new JTextField(5);

        final JTextField m2 = new JTextField(5);
        final JTextField m3 = new JTextField(5);
        final JTextField m4 = new JTextField(5);
        final JLabel mess = new JLabel("matrice A");
        final JLabel op = new JLabel("scegli operazione");
        final JButton btn = new JButton("fatto");
        final Container top = new Container();
        top.setLayout(new FlowLayout());
        top.setSize(180, 10);
        final JComboBox combo = new JComboBox();
        final JButton scalare=new JButton("prodotto scalare");
        scalare.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
            String input = JOptionPane.showInputDialog(frame,"inserisci lo scalare");
            final int scal=Integer.parseInt(input);
            SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
            Integer tmp= scal*(Integer.parseInt(m1.getText()));
            m1.setText(tmp.toString());
            tmp= scal*(Integer.parseInt(m2.getText()));
            m2.setText(tmp.toString());
            tmp= scal*(Integer.parseInt(m3.getText()));
            m3.setText(tmp.toString());
            tmp= scal*(Integer.parseInt(m4.getText()));
            m4.setText(tmp.toString());
            }
            });
            }
        });


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                //frame.add(top);
                top.add(mess);
                frame.add(m1);
                frame.add(m2);
                frame.add(m3);
                frame.add(m4);
                frame.add(op);
               // frame.add(btn);
                frame.setSize(180, 180);
                combo.setName("scegli operazione");
                frame.add(scalare);
                //frame.add(combo);
                
            }
        });

    }
}
