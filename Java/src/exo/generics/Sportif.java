package exo.generics;

import java.time.LocalDate;

public abstract class Sportif {

    private String nom;
    private LocalDate dateNaiss;

    public Sportif(String nom, LocalDate dateNaiss) {
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    @Override
    public String toString() {
        return "Sportif{" +
                "nom='" + nom + '\'' +
                ", dateNaiss=" + dateNaiss +
                '}';
    }
}
