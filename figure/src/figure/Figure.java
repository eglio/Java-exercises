
package figure;
public class Figure {

    public static void main(String[] args) {
        FiguraGeometrica f = new FiguraGeometrica("rosso",10);
        System.out.println(f.toString());
        
        FiguraGeometrica f1 = new FiguraGeometrica("verde",3);
        System.out.println(f1);        //VALUTANDO OGGETTO COME STRINGA USA SEMPRE TOSTRING
        
        Triangolo t = new Triangolo("blu",10,2,3);
        System.out.println(t);
        
        rettangolo r = new rettangolo("nero",2,8,1);
        System.out.println(r);
        
        Quadrato q = new Quadrato("azzurro",3,8);
        System.out.println(q);

        Cerchio c = new Cerchio("viola",3,5);
        System.out.println(c);
    }
}
