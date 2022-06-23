package poo.interf;

public class VoitureAmphibie extends Vehicule implements Roulant, Flottant {

    public VoitureAmphibie(String marque) {
        super(marque);
    }

    @Override
    public void rouler() {
        System.out.println("La voit amphibie roule");
    }

    @Override
    public void flotter() {
        // faire un truc
    }

    @Override
    public void flotter(int distance) {
        // faire un truc
    }

    @Override
    public void couler() {
        // faire un truc
    }
}
