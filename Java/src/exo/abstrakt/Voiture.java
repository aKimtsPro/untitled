package exo.abstrakt;

public final class Voiture extends VehiculeARoue {

    public Voiture(String marque, String modele) {
        super(marque, modele);
    }

    @Override
    public void seDeplacer() {
        seDeplacer( 50 );
    }

    // Voiture - seDeplacer - int
    @Override
    public void seDeplacer(int nbrKm) {
        System.out.println("La voiture se déplace de " + nbrKm + "km");
        super.seDeplacer(nbrKm);
        System.out.println("nbrKmParcouru : " + getNbrKmParcouru());
    }
}
