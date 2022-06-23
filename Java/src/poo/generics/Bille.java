package poo.generics;

public class Bille implements Lancable {

    private int diametre;

    public Bille(int diametre) {
        this.diametre = diametre;
    }

    public int lancer(){
        return 10 + diametre;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }
}
