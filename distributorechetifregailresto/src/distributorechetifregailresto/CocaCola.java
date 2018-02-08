/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

/**
 *
 * @author egliocz
 */
public class CocaCola extends Bevanda{
    private String tipoCola;

    public CocaCola(String tipoCola, String codice, String nome, double prezzo, int numero) {
        super(codice, nome, prezzo, numero);
        this.tipoCola = tipoCola;
    }

}
