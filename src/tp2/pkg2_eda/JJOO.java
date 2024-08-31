package tp2.pkg2_eda;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Joaco
 */
public class JJOO {
    
    private String pais;
    private int cmBronce,cmPlata,cmOro,ranking;

    public JJOO(String pais, int cmOro, int cmPlata, int cmBronce) {
        this.pais = pais;
        this.cmBronce = cmBronce;
        this.cmPlata = cmPlata;
        this.cmOro = cmOro;
        this.ranking = 0;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCmBronce() {
        return cmBronce;
    }

    public void setCmBronce(int cmBronce) {
        this.cmBronce = cmBronce;
    }

    public int getCmPlata() {
        return cmPlata;
    }

    public void setCmPlata(int cmPlata) {
        this.cmPlata = cmPlata;
    }

    public int getCmOro() {
        return cmOro;
    }

    public void setCmOro(int cmOro) {
        this.cmOro = cmOro;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "JJOO{" + "pais=" + pais + ", cmBronce=" + cmBronce + ", cmPlata=" + cmPlata + ", cmOro=" + cmOro + ", ranking=" + ranking + '}';
    }

    public static Comparator<JJOO> comparator = new Comparator<JJOO>() {
        @Override
        public int compare(JJOO p1, JJOO p2) {
            if (p1.getCmOro() != p2.getCmOro()) {
                return p2.getCmOro() - p1.getCmOro();
            } else if (p1.getCmPlata() != p2.getCmPlata()) {
                return p2.getCmPlata() - p1.getCmPlata();
            } else if (p1.getCmBronce() != p2.getCmBronce()) {
                return p2.getCmBronce() - p1.getCmBronce();
            } else {
                return p1.getPais().compareTo(p2.getPais());
            }
        }
    };

    
    
    
    
}
