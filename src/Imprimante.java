public class Imprimante {
    // DECLARATION DES ATTRIBUTS
    protected int nbrCopieParS; // nombre de copie par seconde
    protected double alimentation;
    protected String dimPapMax;// dimension max du papier
    protected String marque;
    protected int categorie;

    // CONSTRUCTEURS
    public Imprimante(){
        this.nbrCopieParS = 0;
        this.alimentation = 0;
        this.dimPapMax = "Inconu";
        this.marque = "Inconu";
        this.setCategorie();
    }
    public  Imprimante(int nCoPaS, double alim, String dpm, String mrq){
        this.nbrCopieParS = nCoPaS;
        this.alimentation = alim;
        this.dimPapMax = dpm;
        this.marque = mrq;
        this.setCategorie();
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
        this.setCategorie();
    }

    public void setCategorie() {
        String[] dim = {"A4", "A3", "A2", "A1", "A0"};
        int categorie[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < dim.length; i++) {
            if (this.dimPapMax.equals(dim[i])) {
                this.categorie = categorie[i];
                return; // Sortir de la méthode dès que la correspondance est trouvée
            }
        }
        // Si aucune correspondance n'est trouvée, la catégorie reste inchangée
    }

    // LES METHODES
    public String comparaison( Imprimante I1 ){
        String str = new String();
        if (I1.getNbrCopieParS() > this.nbrCopieParS && I1.getCategorie() > this.categorie){
            System.out.println(I1.getMarque()+" est plus performant que "+this.marque);
        }
        else if (I1.getNbrCopieParS() < this.nbrCopieParS && I1.getCategorie() < this.categorie) {
            System.out.println(I1.getMarque()+" est moins performant que "+this.marque);
        }
        else if (I1.getNbrCopieParS() == this.nbrCopieParS && I1.getCategorie() == this.categorie) {
            System.out.println(I1.getMarque()+" a la même perf que "+this.marque);
        }
        else if (I1.getNbrCopieParS() > this.nbrCopieParS && I1.getCategorie() < this.categorie){
            System.out.println(I1.getMarque()+" peut faire plus de copie en une minute que "+this.marque+"\nmais" +
                    " "+this.marque+" peut suporter des dimensions de papier plus grand que "+I1.getMarque());
        }
        else if (I1.getNbrCopieParS() < this.nbrCopieParS && I1.getCategorie() > this.categorie){
            System.out.println(I1.getMarque()+" peut faire moins de copie en une minute que "+this.marque+"\nmais" +
                    " "+this.marque+" ne peut pas suporter des dimensions de papier plus grand que "+I1.getMarque());
        }
        else{
            System.out.println("impossible de faire la comparaison");
        }
        return str;
    }
}
