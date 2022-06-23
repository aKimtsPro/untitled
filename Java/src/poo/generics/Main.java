package poo.generics;

import poo.heritage.CDD;
import poo.heritage.Cadre;
import poo.heritage.Employe;
import poo.heritage.Personne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //
        List<Personne> list0 = new ArrayList<>(); // doit être Personne et c'est tout

        List<? extends Personne> list = new ArrayList<CDD>(); // ? doit être Personne ou enfant de Personne
        list = new ArrayList<Employe>();
        list = new ArrayList<Cadre>();
        list = new ArrayList<>(); // ArrayList<Personne>()

        List<? super CDD> list1 = new ArrayList<Personne>(); // ? doit être CDD ou parent de CDD
        list1 = new ArrayList<Object>();
        list1 = new ArrayList<Employe>();
        list1 = new ArrayList<>(); // ArrayList<CDD>()

        //
        Boite<Des> boite = new Boite<Des>(5);

        System.out.println("après instanciation" + boite);

        boite.ajouter(new Des(6));
        boite.ajouter(new Des(6));
        boite.ajouter(new Des(6));

        System.out.println("après 3 ajouts" + boite);

        boite.ajouter(new Des(6));
        boite.ajouter(new Des(6));

        System.out.println("après 5 ajouts" + boite);

        Des supprime = boite.retirer(2);
        boite.indexOf(null);

        System.out.println("après la suppression de l'index 2" + boite);

        // Associe un nom(String) à un dès(Des)
        HashMap<String, Des> map = new HashMap<>();
    }
}
