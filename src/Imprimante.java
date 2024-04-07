public class Imprimante {
    // DECLARATION DES ATTRIBUTS
    protected int nbrCopieParS; // nombre de copie par seconde
    protected double alimentation;
    protected String dimPapMax;// dimension max du papier
    protected String marque;
    protected int categorie;

    // CONSTRUCTEURS
    public  Imprimante(int nCoPaS, double alim, String dpm, String mrq){
        this.nbrCopieParS = nCoPaS;
        this.alimentation = alim;
        this.dimPapMax = dpm;
        this.marque = mrq;
    }

    // GETTERS
    public int getNbrCopieParS() {
        return nbrCopieParS;
    }
    public double getAlimentation() {
        return alimentation;
    }
    public String getMarque() {
        return marque;
    }
    public String getDimPapMax() {
        return dimPapMax;
    }

    public int getCategorie() {
        return categorie;
    }

    // SETTERS
    public void setNbrCopieParS(int nbrCopieParS) {
        this.nbrCopieParS = nbrCopieParS;
    }
    public void setAlimentation(double alimentation) {
        this.alimentation = alimentation;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setDimPapMax(String dimPapMax) {
        this.dimPapMax = dimPapMax;
    }

    public void setCategorie() {
        String[] dim = {"A4", "A3", "A2", "A1", "A0"};
        int categorie[] = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < dim.length && this.dimPapMax.equals(dim[i])){
            this.categorie = categorie[i];
        }
    }

    // LES METHODES
    public String comparaison(Imprimante I1){
        String str = new String();
        if (I1.getNbrCopieParS() > this.nbrCopieParS && I1.getCategorie() > this.categorie){

        }
        return str;
    }
}
