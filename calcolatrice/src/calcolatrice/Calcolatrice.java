package calcolatrice;

import javax.swing.JOptionPane;

/**
 *
 * @author Antonio
 */
public class Calcolatrice {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int scelta;
        String inputValue;

        inputValue = JOptionPane.showInputDialog("Scegli l'operazione da effettuare:\n"
                + "1. Addizione\n"
                + "2. Moltiplicazione\n"
                + "3. Divisione\n");
        scelta = Integer.parseInt(inputValue);
        if (scelta <= 0 || scelta >= 4) {
            JOptionPane.showMessageDialog(null, "Scelta non consentita");
        } else {
                double risultato;
                inputValue = JOptionPane.showInputDialog("Inserisci primo numero:");
                double num1 = Integer.parseInt(inputValue);
                inputValue = JOptionPane.showInputDialog("Inserisci il secondo numero:");
                double num2 = Integer.parseInt(inputValue);
                switch (scelta) {
                    case 1:
                        risultato = num1+num2;
                        JOptionPane.showMessageDialog(null, "La somma di "+num1+" + "+num2+" è: "+risultato);
                        break;
                    case 2:
                        risultato = num1*num2;
                        JOptionPane.showMessageDialog(null, "Il prodotto di "+num1+" x "+num2+" è: "+risultato);
                        break;
                    case 3:
                        risultato = num1/num2;
                        JOptionPane.showMessageDialog(null, "La divisione di "+num1+" : "+num2+" è: "+risultato);
                        break;                        
                }while(scelta<4 && scelta>0);  
                System.exit(1);
            }
        }
    }
