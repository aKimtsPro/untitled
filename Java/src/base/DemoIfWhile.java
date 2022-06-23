package base;

import java.util.Scanner;

public class DemoIfWhile {

    public static void main(String[] args) {

        // if ... else if ... else

        int age = 150;

        if ( age < 12 ) { // age < 12
            System.out.println("vous ^tes un enfant");
        }
        else if( age < 18 ) { // age >= 12 && age < 18
            System.out.println("vous êtes un adolescent");
        }
        else if( age < 65 ) { // [age >= 12 &&] age >= 18 && age < 65
            System.out.println("vous êtes un adulte");
        }
        else { // [age >= 12 && age >= 18 &&] age >= 65
            System.out.println("vous êtes à la retraite");
        }

        System.out.println("fin de la structure conditionnelle");

        // switch ... case

        System.out.println("----- Menu ----");
        System.out.println("a) dire bonjour ");
        System.out.println("b) donner un compliment ");
        System.out.println("c) être méchant ");

        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        switch ( character ) {
            case 'a': // execute rien mais pas de break => on execute la suite
            case 'A':
                // exec si character == 'a'
                System.out.println("bonjour");
                break;
            case 'b':
            case 'B':
                // exec si character == 'b'
                System.out.println("vous êtes bien habillé");
                break;
            case 'c':
            case 'C':
                // exec si character == 'c'
                System.out.println("Vous êtes mal habillé");
                break;
            default:
                // exec si egal à aucun
                System.out.println("valeur entrée invalide");
        }


        if( character == 'a' || character == 'A' ){
            System.out.println("bonjour");
        }

        else if (character == 'b' || character == 'B'){
            System.out.println("vous êtes bien habillé");
        }
        else if ( character == 'c' || character == 'C' ){
            System.out.println("Vous êtes mal habillé");
        }
        else {
            System.out.println("valeur entrée invalide");
        }

        // Boucles

        // while

        int cpt = 0;
        while( cpt < 5 ) {
            System.out.println("salut");
            cpt++;
        }

        // do ... while

        do {
            System.out.println("----- Menu ----");
            System.out.println("a) dire bonjour ");
            System.out.println("b) donner un compliment ");
            System.out.println("c) être méchant ");
            System.out.println("d) quitter ");

            character = sc.next().charAt(0);

            switch ( character ) {
                case 'a': // execute rien mais pas de break => on execute la suite
                case 'A':
                    // exec si character == 'a'
                    System.out.println("bonjour");
                    break;
                case 'b':
                case 'B':
                    // exec si character == 'b'
                    System.out.println("vous êtes bien habillé");
                    break;
                case 'c':
                case 'C':
                    // exec si character == 'c'
                    System.out.println("Vous êtes mal habillé");
                    break;
                case 'd':
                case 'D':
                    System.out.println("au revoir");
                    break;
                default:
                    // exec si egal à aucun
                    System.out.println("valeur entrée invalide");
            }
        } while ( character != 'd' && character != 'D' );

        // boucle for

        for( int i = 0 ; i < 5 ; i++ ){
            System.out.println("salut");
        }

        // bouche foreach




    }

}
