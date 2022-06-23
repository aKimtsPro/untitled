package base;

import poo.encaps.Pizza;

import java.util.ArrayList;

public class TableauEtCollection {

    public static void main(String[] args) {

        // tableau - taille stable

        // Le tableau ne peut pas changer de taille dynamiquement
        // Plus perfomant dans l'interaction avec les éléments

        // à utilisé quand le nbr d'élément est connu et stable

        int[] tableau = new int[5];
        tableau = new int[]{ 1, 2, 3, 4, 5 };

        // tableau[-1] = 8; // erreur
        tableau[0] = 19;
        tableau[tableau.length-1] = 24;
        // tableau[tableau.length] = 56; // erreur


        // ATTENTION: on n'interragi pas avec la variable du tableau mais bien avec i qui a la meme valeur
        for (int i : tableau) { // les modifs faites sur i n'impactent pas l'objet
            System.out.println(i);
        }

        int[][] echiquier = new int[8][8];

        for (int[] ints : echiquier) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // collection - taille pas stable

        System.out.println("------------ collections ---------------");

        // Je dois utiliser le type wrapper de int
        ArrayList<String> list = new ArrayList<>();

        // {}

        System.out.println( list.size() ); // recupère la taille de la liste
        list.add("1");// ajoute un élément à list au dernier index
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        System.out.println( list.size() );
        list.get(2);// récupère la valeur de l'élément à l'index donné
        list.set(2, "30"); // modifie la valeur de l'élément à l'index donné
        list.remove("6"); // retire un Objet de la list
        list.remove(4); // retire l'élément d'index donné de la list
        list.contains("30"); // donne un boolean verifiant si l'Objet est contenu
        list.indexOf("30"); // donne l'index de l'Objet donné dans la list(si absent -1)


        for (String i : list) {
            System.out.println(i);
        }


        // PS

        Pizza pizza1 = new Pizza("pizza 1");
        Pizza pizza2 = new Pizza( "pizza 2");
        Pizza[] tabPizza = new Pizza[]{pizza1, pizza2};

//        for (Pizza pizza : tabPizza) {
//            //
//            pizza.nom += " (modif)";
//        }

        for (Pizza pizza : tabPizza) {
            System.out.println(pizza.getNom());
        }

        // pizza 1
        // pizza 2

        // pizza 1 (modif)
        // pizza 2 (modif)



        int[] tabInt = new int[]{ 1, 2 };

        for (int i : tabInt) {
            i++;
            System.out.println(i);
        }

        for (int i : tabInt) {
            System.out.println(i);
        }

        // 1
        // 2
    }

}
