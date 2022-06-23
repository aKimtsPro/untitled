package exo.heritage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Footballeur f1 = new Footballeur("Ca c'est le foot", "michel");
        Basketteur b1 = new Basketteur("Ca c'est le basket", "pauline");

        System.out.println("---------------------");

        System.out.println(f1.getNbrGoal());
        f1.marqueBut();
        System.out.println(f1.getNbrGoal());

        System.out.println("---------------------");

        System.out.println(b1.getNbrPoint());
        b1.marquerPanier(true);
        System.out.println(b1.getNbrPoint());


        System.out.println("------ BONUS --------");
        List<Sportif> sportifs = new ArrayList<>();

        sportifs.add( f1 );
        sportifs.add( b1 );
        sportifs.add( new Footballeur("bo jeu", "mariline"));
        sportifs.add( new Basketteur("jeu bonus", "dominique"));

        for (Sportif sportif : sportifs) {
            sportif.celebrerVictoire();
        }
    }
}
