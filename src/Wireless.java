 class Wireless extends Imprimante{
    private double distanceMax;
    public Wireless(){
        super();
        this.distanceMax = 0;
    }
    public Wireless(int nCoPaS, double alim, String dpm, String mrq, double disM){
        super(nCoPaS, alim, dpm, mrq);
        this.distanceMax = disM;
    }

     public double getDistanceMax() {
         return distanceMax;
     }

     public void setDistanceMax(double distanceMax) {
         this.distanceMax = distanceMax;
     }

 }
