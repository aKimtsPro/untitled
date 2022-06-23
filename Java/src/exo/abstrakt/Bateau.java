package exo.abstrakt;

public final class Bateau extends Vehicule {

    public Bateau(String marque, String modele) {
        super(marque, modele);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le bateau fait: plouf plouf");
    }
}
