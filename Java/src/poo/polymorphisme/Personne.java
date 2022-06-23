package poo.polymorphisme;

public class Personne extends Vivant {

    private String nom;

    public Personne(){
    }

    public Personne(String nom) {
        this.nom = nom;
    }

    // polymorphisme ad hoc - surcharge
    // Personne - grandir - int, boolean
    public void grandir(int cm, boolean rapide) {
        System.out.println( nom + " grandit de " + cm + " cm");
    }

    // Personne - grandir - boolean, int
    public void grandir(boolean rapide, int cm) {
        System.out.println( nom + " grandit de " + cm + " cm");
    }

    // Personne - retrecir - int
    public void retrecir(int autreNom) {
        System.out.println( nom + " rétréci de " + autreNom + " cm");
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
