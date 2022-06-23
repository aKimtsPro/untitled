package exo.generics;

import exo.generics.exception.CompetitionAlreadyFinishedException;
import exo.generics.exception.NotEnoughParticipantException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Competition<S extends Sportif> {

    // ATTIBUTES(class variables)

    private final List<S> participants = new ArrayList<>();
    private Podium<S> podium;
    private boolean finished;

    // METHODS

    public void addParticipant( S toAdd ){

        if( finished )
            throw new CompetitionAlreadyFinishedException("impossible d'ajout des participants à une compétition terminée");

        participants.add(toAdd);

    }

    public void cancelInscription( S toCancel ){

        if( finished )
            throw new CompetitionAlreadyFinishedException ("impossible d'annuler des inscription à une compétition terminée");

        if( !participants.contains(toCancel) )
            throw new IllegalArgumentException("Le sportif '"+ toCancel.getNom() +"' n'est pas un participant");

        participants.remove( toCancel );

    }

    public void end(){

        if( finished )
            throw new CompetitionAlreadyFinishedException("Impossible de terminer une competition déjà terminée");

        if( participants.size() < 3 )
            throw new NotEnoughParticipantException("impossible de terminer une competition avec 3 participants");

        finished = true;

        List<S> medaillePossible = new ArrayList<>(participants);

        S or = medaillePossible.get( new Random().nextInt( medaillePossible.size()) ); // 0 - 4
        medaillePossible.remove(or);
        S argent = medaillePossible.get( new Random().nextInt( medaillePossible.size()) ); // 0 - 3;
        medaillePossible.remove(argent);
        S bronze = medaillePossible.get( new Random().nextInt( medaillePossible.size()) ); // 0 - 2;
        medaillePossible.remove(bronze);

        podium = new Podium<>(or, argent, bronze);
    }

    // OVERRIDES

    @Override
    public String toString() {
        return "Competition{" +
                "participants=" + participants.size() +
                ", podium=" + podium +
                ", finished=" + finished +
                '}';
    }


    // GET/SET

    public List<S> getParticipants() {
        return new ArrayList<>( participants );
    }

    public Podium<S> getPodium() {
        return podium;
    }

    public boolean isFinished() {
        return finished;
    }
}
