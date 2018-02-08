/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

/**
 *
 * @author egliocz
 */
public class Acqua extends Bevanda{
    private String tipoAcqua;

    public Acqua(String tipoAcqua, String codice, String nome, double prezzo, int numero) {
        super(codice, nome, prezzo, numero);
        this.tipoAcqua = tipoAcqua;
    }
    
    
}
