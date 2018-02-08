package distributore;

import distributore.eccezioni.BevandaEsaurita;
import distributore.eccezioni.TesseraNonValida;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Distributore {

    List<Bevanda> bev;
    Set<Tessera> tes;

    public Distributore() {
        this.bev = new ArrayList<Bevanda>();
        this.tes = new HashSet<Tessera>();
    }
    
    

    public double leggiCredito(int Codice) throws TesseraNonValida {
        Iterator<Tessera> iter = tes.iterator();
        Tessera tmp = null;
        if (!tes.isEmpty()) {
            while (iter.hasNext()) {
                tmp = iter.next();
                if (tmp.getCodice() == Codice) {
                    break;
                }
            }
        } else {
            throw new TesseraNonValida();
        }
        return tmp.getCredito();

    }

    public void registraTessera(Tessera t) {
        tes.add(t);
    }

    public void caricaBevanda(Bevanda b) {
        bev.add(b);
    }

    public void caricaTessera(Tessera t, int money) throws TesseraNonValida {
        if (tes.contains(t)) {
            t.carica(money);
        } else {
            throw new TesseraNonValida();
        }
    }

    public int lattineDisponibili() {
        int i = 0;
        Iterator<Bevanda> it = bev.iterator();
        while (it.hasNext()) {
            Bevanda b = it.next();
            i = i + 1;
        }
        return i;
    }

    ;
    
    public Bevanda erogaProdotto(String Nome, String Codice) throws BevandaEsaurita {
        Bevanda tmp = null;
        if (!bev.isEmpty()) {
            Iterator<Bevanda> it = bev.iterator();
            while (it.hasNext()) {
                tmp = it.next();
                if (tmp.getCodice().equals(Codice)) {
                    break;
                }
            }
        } else {
            throw new BevandaEsaurita();
        }
        return tmp;
    }
;    
}