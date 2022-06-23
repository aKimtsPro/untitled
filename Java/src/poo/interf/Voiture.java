package poo.interf;

public class Voiture extends Vehicule implements Roulant {

    public Voiture(String marque) {
        super(marque);
    }

    public void rouler() {
        System.out.println( "La voiture roule");
    }

}
