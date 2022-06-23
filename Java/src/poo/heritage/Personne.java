package poo.heritage;

import java.time.LocalDate;

public abstract class Personne {

    private String prenom;
    private String nom;
    private LocalDate dateNaiss;

    public Personne(String prenom, String nom, LocalDate dateNaiss) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaiss = dateNaiss;
    }

    public void manger() {
        System.out.println("La personne mange");
    }
    public abstract void travailler();

    // region get/set

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    // endregion
}
