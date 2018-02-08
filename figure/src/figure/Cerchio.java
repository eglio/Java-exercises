/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

/**
 *
 * @author egliocz
 */
public class Cerchio extends FiguraGeometrica{
    private int r;
    
    @Override
    public double area(){
        return (r*r*3.14);
    }
    public double perimetro(){
        return (float) (r * 6.28);
}
       public int getRaggio(){
       return r;
   }
       
   public Cerchio(String colore,int bordo,int rag){
       super(colore,bordo);
       this.r=rag;
   }
  
 
}
