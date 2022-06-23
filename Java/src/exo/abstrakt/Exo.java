package exo.abstrakt;

import java.util.ArrayList;
import java.util.List;

public class Exo {

    public static void main(String[] args) {

        List<Vehicule> list = new ArrayList<>();

        list.add( new Moto("mo", "to") );
        list.add( new Voiture("voi", "ture") );
        list.add( new Bateau("ba", "to") );

        for (Vehicule vehicule : list) {
            vehicule.seDeplacer();
            if( vehicule instanceof VehiculeARoue ){
                System.out.println("km parcouru" + ((VehiculeARoue) vehicule).getNbrKmParcouru());
            }
        }

    }

}
