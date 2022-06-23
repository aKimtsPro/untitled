package poo.heritage;

import java.time.LocalDate;

public final class CDD extends Employe {

    public CDD(String prenom, String nom, LocalDate dateNaiss, double salaireHeure) {
        super(prenom, nom, dateNaiss, salaireHeure);
    }

    @Override
    public void travailler() {
        System.out.println(" en tant qu'employé CDD je travaille");
    }
}
