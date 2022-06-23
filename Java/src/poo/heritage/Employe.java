package poo.heritage;

import java.time.LocalDate;

public abstract class Employe extends Personne {

    private double salaireHeure;

    public Employe( String prenom, String nom, LocalDate dateNaiss, double salaireHeure ){
        super( prenom, nom, dateNaiss );
        this.salaireHeure = salaireHeure;
    }

    // region get/set

    public double getSalaireHeure() {
        return salaireHeure;
    }

    public void setSalaireHeure(double salaireHeure) {
        this.salaireHeure = salaireHeure;
    }

    // endregion
}
