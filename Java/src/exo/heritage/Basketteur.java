package exo.heritage;

public class Basketteur extends Sportif {

    private int nbrPoint;

    public Basketteur(String replique, String nom) {
        super(replique, nom);
    }

    public void marquerPanier( boolean troisPoint ) {
        int nbrPoint = troisPoint ? 3 : 2;

        System.out.println( getNom() + " a mis un panier à " + nbrPoint + "points.");
        this.nbrPoint += nbrPoint;
        celebrerVictoire();
    }

    public int getNbrPoint() {
        return nbrPoint;
    }
    private void setNbrPoint(int nbrPoint) {
        if( nbrPoint >= 0)
            this.nbrPoint = nbrPoint;
    }
}
