package exo.polymorphisme;

public class Personne {

    private String nom;

    public Personne(String nom) {
        this.nom = nom;
    }

    // Personne - saluer - /
    public void saluer() {
        System.out.println("Salut");
    }

    // Personne - saluer - Personne
    public void saluer( Personne aSaluer ) {
        System.out.println( "Salut " + aSaluer.getNom() );
    }

    // Personne - saluer - int
    public void saluer( int iteration ) {
        for (int i = 0; i < iteration; i++) {
            saluer();
        }
    }

    // Personne - saluer - int, Personne
    public void saluer ( int iteration, Personne aSaluer ) {
        for (int i = 0; i < iteration; i++) {
            saluer( aSaluer );
        }
    }

    // Personne - saluer - Personne, int
    public void saluer( Personne aSaluer, int iteration ) {
        saluer( aSaluer );
        saluer( iteration-1 );
    }





    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
