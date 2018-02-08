/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

/**
 *
 * @author egliocz
 */
public class Birra extends Bevanda{
    private String marca;

    public Birra(String marca, String codice, String nome, double prezzo, int numero) {
        super(codice, nome, prezzo, numero);
        this.marca = marca;
    }
    
    
}
