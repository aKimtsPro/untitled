package exo.abstrakt;

public abstract class VehiculeARoue extends Vehicule {

    private int nbrKmParcouru;

    public VehiculeARoue(String marque, String modele) {
        super(marque, modele);
    }

    // VehiculeARoue - seDeplacer - int
    public void seDeplacer(int nbrKm) {
        nbrKmParcouru += nbrKm;
    }

    public int getNbrKmParcouru() {
        return nbrKmParcouru;
    }

    public void setNbrKmParcouru(int nbrKmParcouru) {
        this.nbrKmParcouru = nbrKmParcouru;
    }
}
