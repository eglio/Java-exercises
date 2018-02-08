package geometria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author egliocz
 */
public class RuffiniListener implements ActionListener{
    private JFrame frame;

    public RuffiniListener(JFrame frame) {
        this.frame = frame;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "da finire");
    
    }
    
}