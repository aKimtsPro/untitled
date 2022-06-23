package exo.heritage;

public class Footballeur extends Sportif {

    private int nbrGoal;

    public Footballeur( String replique, String nom  ){
        super( replique, nom );
    }

    public void marqueBut() {
        System.out.println( getNom() + " a marqué un goal." );
        nbrGoal++;
        celebrerVictoire();
    }

    public int getNbrGoal() {
        return nbrGoal;
    }
    public void setNbrGoal(int nbrGoal) {
        this.nbrGoal = nbrGoal;
    }
}
