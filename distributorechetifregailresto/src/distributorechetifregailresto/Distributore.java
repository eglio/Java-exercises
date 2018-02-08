/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorechetifregailresto;

import distributore.eccezioni.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author egliocz
 */
public class Distributore {

    private Set<Tessera> tessere;
    private List<Bevanda> bevande;

    public Distributore() {
        this.tessere = new LinkedHashSet<>();
        this.bevande = new LinkedList<>();
    }

    public void registraBevanda(Bevanda b) {
        bevande.add(b);
    }

    public void registraTessera(Tessera t) {
        tessere.add(t);
    }

    public void caricaBevanda(String codice, int numero) throws BevandaNonValida {
        boolean found = false;
        for (Bevanda b : bevande) {
            if (codice.compareTo(b.getCodice()) == 0) {
                b.setNumero(b.getNumero() + numero);
                found = true;
            }
        }
        if (!found) {
            throw new BevandaNonValida();
        }
    }

    public void caricaTessera(int codiceTessera, double credito) throws TesseraNonValida {
        boolean found = false;
        for (Tessera b : tessere) {
            if (codiceTessera == b.getCodiceTessera()) {
                b.setCredito(b.getCredito() + credito);
                found = true;
            }

        }
        if (!found) {
            throw new TesseraNonValida();
        }
    }

    public int lattineDisponibili(String codice) throws BevandaNonValida, BevandaEsaurita {
        for (Bevanda b : bevande) {
            if (codice.compareTo(b.getCodice()) == 0) {
                if (b.getNumero() == 0) {
                    throw new BevandaEsaurita();
                } else {
                    return b.getNumero();
                }

            }
        }

        throw new BevandaNonValida();
    }

    public void erogaProdotto(String codice, int codiceTessera) throws TesseraNonValida, BevandaEsaurita, CreditoInsufficiente, BevandaNonValida {
        boolean foundt = false;
        boolean foundb = false;
        Tessera tmp = null;
        for (Tessera t : tessere) {
            if (t.getCodiceTessera() == codiceTessera) {
                tmp = t;
                foundt = true;
                System.out.println("tessera trovata"+String.valueOf(tmp.getCodiceTessera()));
            }
            
            }if (!foundt) {
                throw new TesseraNonValida();
        }

        for (Bevanda b : bevande) {
            if (codice.compareTo(b.getCodice())==0) {
                foundb = true;
                System.out.println(b.getCodice());
                try {
                    if (lattineDisponibili(codice) > 0) {
                        if (tmp.getCredito() < b.getPrezzo()) {
                            throw new CreditoInsufficiente();
                        } else {
                            b.setNumero(b.getNumero()-1);
                            tmp.setCredito(tmp.getCredito() - b.getPrezzo());
                            System.out.println("bevanda ok");
                        }


                    }
                } catch (BevandaNonValida | BevandaEsaurita e) {
                    throw e;
                }

            }
        }if (!foundb){throw new BevandaNonValida();}
    }

    public double leggiCredito(int codice) throws TesseraNonValida {
        for (Tessera b : tessere) {
            if (codice == b.getCodiceTessera()) {
                return b.getCredito();
            }
        }
        throw new TesseraNonValida();
    }
}
