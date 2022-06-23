package poo.polymorphisme;

import poo.heritage.Employe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("luc");
        Plante pl = new Plante("rouge");

        // Classe - nom - paramètres
        pl.grandir(10);

        List<Personne> list = new ArrayList<>();

        List<Plante> listP = new ArrayList<>();

    }

    // Polymorphisme paramètrique - généricité
    public static <T> T addTo(T toAdd, Collection<T> collection) {
        return collection.add(toAdd) ? toAdd : null;
    }

}
