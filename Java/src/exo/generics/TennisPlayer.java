package exo.generics;

import java.time.LocalDate;

public class TennisPlayer extends Sportif {

    private LocalDate dateDebutCarriere;

    public TennisPlayer(String nom, LocalDate dateNaiss, LocalDate dateDebutCarriere) {
        super(nom, dateNaiss);
        this.dateDebutCarriere = dateDebutCarriere;
    }

    public LocalDate getDateDebutCarriere() {
        return dateDebutCarriere;
    }

    public void setDateDebutCarriere(LocalDate dateDebutCarriere) {
        this.dateDebutCarriere = dateDebutCarriere;
    }
}
