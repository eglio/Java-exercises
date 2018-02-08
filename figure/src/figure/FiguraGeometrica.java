package figure;

public class FiguraGeometrica {
    private String colore;
    private int spessore;
    
    public double perimetro(){
    return 0;
    };
    public double area(){
        return 0;
    }
    public int getSpessore(){
     return spessore;
    }
    
    public String getColore(){
     return colore;  
    }
  public FiguraGeometrica(String colore, int spessore){     //COSTRUTTORE, STESSO NOME CLASSE
    this.colore=colore;
    this.spessore=spessore;
}
  //TOSTRING STANDARD RITORNA PACKAGE.CLASSE@INDIRIZZO OGGETTO
  public String toString(){
      return "colore "+this.colore+" spessore "+this.spessore;
  }
  
  
  
  
}


