package exo.abstrakt;

public final class Moto extends VehiculeARoue {

    public Moto(String marque, String modele) {
        super(marque, modele);
    }

    @Override
    public void seDeplacer() {
        seDeplacer(30);
    }

    @Override
    public void seDeplacer(int nbrKm) {
        System.out.println("La moto se déplace de "+ nbrKm + " km");
        super.seDeplacer(nbrKm);
        System.out.println("La moto a parcouru :" + getNbrKmParcouru());
    }
}
