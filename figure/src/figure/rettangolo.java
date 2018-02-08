/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

/**
 *
 * @author egliocz
 */
public class rettangolo extends FiguraGeometrica{
    private double base;
    private double altezza;
    
    public rettangolo(String colore, int spessore, double base, double alteza){
       super(colore,spessore);
       this.base=base;
       this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }
   public double perimetro(){
       return base+base+altezza+altezza;
   }
   public double area() {
       return base*altezza;
   }

    @Override
    public String toString() {
        return "rettangolo: "+super.toString()+" base " + base + ", altezza " + altezza ;
    }
   

}
