/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

/**
 *
 * @author egliocz
 */
public class Quadrato extends rettangolo{
    
    public Quadrato(String colore, int spessore, double lato){
        super(colore,spessore,lato,lato);                
}

    @Override
    public String toString() {
        return "quadrato: "+super.toString();
    }
    
}
