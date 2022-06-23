package exo.generics;

import exo.generics.exception.CompetitionAlreadyFinishedException;
import exo.generics.exception.NotEnoughParticipantException;
import poo.generics.Des;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Competition<FootballPlayer> compet = new Competition<>();

        System.out.println(compet);

        compet.addParticipant(new FootballPlayer("pol", LocalDate.now()));
        compet.addParticipant(new FootballPlayer("marie", LocalDate.now()));
        compet.addParticipant(new FootballPlayer("louise", LocalDate.now()));

        FootballPlayer player = new FootballPlayer("jules", LocalDate.now());
        compet.addParticipant( player );
        compet.addParticipant(new FootballPlayer("dominique", LocalDate.now()));

        System.out.println(compet);

        compet.cancelInscription( player );

        System.out.println(compet);


        try{
            compet.end();
            compet.end();
        }
        catch (CompetitionAlreadyFinishedException e){
            System.out.println("j'ai recu une already finished");
        }
        catch (NotEnoughParticipantException e){
            System.out.println("j'ai recu une not enough");
        }

        System.out.println(compet);

    }

}
