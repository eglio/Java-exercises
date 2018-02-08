package esercizio.stampanti;

/**
 *
 * @author antonio
 */
public class Multifunzione extends Stampante {
private int risoluzioneScansione;

    public Multifunzione(int risoluzioneScansione, String mod, int ris, float pr) {
        super(mod, ris, pr);
        this.risoluzioneScansione = risoluzioneScansione;
    }

}
