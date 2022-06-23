package poo.interf.hvm;

public abstract class Monstre {

    private String nom;

    public Monstre(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
