package poo.encaps;

public class Pizza {

    private String nom;

    public Pizza(String nom) {
        this.nom = nom;
    }

    public void direCoucou() {
        System.out.println("coucou");
        new Personne().confectionnerPizza(null);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
