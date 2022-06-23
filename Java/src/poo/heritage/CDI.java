package poo.heritage;

import java.time.LocalDate;

public class CDI extends Employe {

    public CDI(String prenom, String nom, LocalDate dateNaiss, double salaireHeure) {
        super(prenom, nom, dateNaiss, salaireHeure);
    }

    @Override
    public void travailler() {
        System.out.println(" en tant qu'employé CDI je travaille");
    }
}
