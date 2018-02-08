package it.unisa.oop2013.contest1.gruppo11;


/**
 *
 * @author egliocz
 */
public class TestStampanti {

    public static void main(String[] args) {
        Stampante st = new Stampante("C15", "Canon");
        Multifunzione mlt = new Multifunzione("OF-1000", "Philips");
        Fax fx = new Fax("F65", "Lexmark", "0892569447");

        System.out.println("Informazioni stampante:");
        System.out.println(st.toString());

        System.out.println("\nInformazioni multifunzione:");
        System.out.println(mlt.toString());

        System.out.println("\nInformazioni fax:");
        System.out.println(fx.toString());

        mlt.acquisisciImmagine();
        System.out.println("\nFax inviato");
        System.out.println(fx.inviaFax("Questo è il Contest del gruppo 11!"));


    }
}
