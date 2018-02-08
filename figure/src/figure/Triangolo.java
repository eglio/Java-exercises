package figure;
import java.math.*;
        
public class Triangolo extends FiguraGeometrica{
    
    
    public Triangolo(String colore, int spessore, int base, int altezza){
        super(colore,spessore);
        this.base=base;
        this.altezza = altezza;               
    
    }
    //DOUBLE PER DIVISIONE
    private double base;
    private double altezza;
    
    public double area(){
        return (base*altezza)/2.0;  //SE NON METTI PUNTO FA DIVISIONE INTERA!!
     }
    
    public double perimetro(){
        return -1;
    }
    
       public double getBase(){
       return base;
   }
   
   public double getAltezza(){
       return altezza;
   } 
   
   public String toString(){
    return "triangolo: "+super.toString()+ " base "+ base + "altezza "+altezza;
   }
}
