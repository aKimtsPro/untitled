package poo.encaps;

public class Personne {

    private String prenom;       // null par défaut
    private String nom;          // null par défaut
    private Pizza pizzaPrefere;  // null par défaut
    private int taille;          // 0 par défaut

    // region ctors

    public Personne() {
    }

    public Personne(String prenom, String nom, Pizza pizzaPrefere) {
        this.prenom = prenom;
        this.nom = nom;
        this.pizzaPrefere = pizzaPrefere;
        this.confectionnerPizza(null);
    }

    // endregion

    // region get/set

    // récupérer - getter
    public int getTaille() {
        return taille;
    }

    // modifier - setter
    public void setTaille( int taille ){
        if( taille >= 0 )
            this.taille = taille;
    }

    //pour générer du code : alt + insert

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

    public Pizza getPizzaPrefere() {
        return pizzaPrefere;
    }

    public void setPizzaPrefere(Pizza pizzaPrefere) {
        if( pizzaPrefere.getNom() != "pas bon" )
            this.pizzaPrefere = pizzaPrefere;
    }

    // endregion


    // region methods

    public void sePresenter() {
        System.out.println("Bonjour je suis " +
                prenom + " " + nom + " et ma pizza préférée est : " + pizzaPrefere.getNom());
    }

    public Pizza confectionnerPizza ( String infoSup ) {
        // what to do
        if( infoSup == "null" )
            return null;

        return new Pizza("pizza renvoyée");
    }

    // endregion
}
