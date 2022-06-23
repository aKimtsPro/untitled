package poo.interf;

public class Bateau extends Vehicule implements Flottant {

    public Bateau(String marque) {
        super(marque);
    }

    public void flotter() {
        System.out.println( "Le bateau flotte ");
    }

    @Override
    public void flotter(int distance) {
        // flotter
    }

    @Override
    public void couler() {
        // couler
    }

}
