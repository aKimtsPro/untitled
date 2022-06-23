package exo.generics;

import java.time.LocalDate;

public class FootballPlayer extends Sportif {

    private int nbrGoal; // = 0;

    public FootballPlayer(String nom, LocalDate dateNaiss){
        super(nom, dateNaiss);
    }

    public int getNbrGoal() {
        return nbrGoal;
    }

    public void setNbrGoal(int nbrGoal) {
        this.nbrGoal = nbrGoal;
    }
}
