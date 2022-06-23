package poo.heritage;

import java.time.LocalDate;

public class Cadre extends Personne {

    private double salaireMois;

    public Cadre(String prenom, String nom, LocalDate dateNaiss, double salaireMois) {
        super(prenom, nom, dateNaiss);
        this.salaireMois = salaireMois;
    }

    @Override
    public void travailler() {
        System.out.println("En tant que cadre je travaille");
    }

    // region get/set

    public double getSalaireMois() {
        return salaireMois;
    }

    public void setSalaireMois(double salaireMois) {
        this.salaireMois = salaireMois;
    }

    // endregion
}
