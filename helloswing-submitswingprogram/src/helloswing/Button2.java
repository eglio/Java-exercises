/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloswing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author egliocz
 */
public class Button2 extends JFrame {

    private JButton b1 = new JButton("button 1"),
            b2 = new JButton("button 2");
    private JTextField txt = new JTextField(10);

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String name = ((JButton) ae.getSource()).getText();
            txt.setText(name);
        }
    }
    private Button2.ButtonListener bl1 = new Button2.ButtonListener();

    public Button2() {
        b1.addActionListener(bl1);
        b2.addActionListener(bl1);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(txt);
    }
}
