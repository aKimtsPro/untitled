package base;

import poo.encaps.Pizza;

public class DemoTypes {

    public static void main(String[] args) {

        // Declarations de variable

        int premiere; // pas utilisable si pas initialisé
        int deuxieme = 4;
        int x, y, z;
        int g=1, h, i=14;

        // Les types primitifs - type valeur

        // entier
        byte octet = 127; // entier sur 1 octet
        short deuxOctet = 32767; // entier sur 2 octet
        int quatreOctet = 2_000_000_000; // entier sur 4 octet
        long huitOctet = 999_999_999_999_999_999L; // entier sur huit octet

        // reel - nombre à virgule
        float nbrAVirgule = 0.8F;   // reel sur 4 octets
        double nbrAVirgulePrecis = 0.8; // reel sur 8 octets

        // other
        boolean bool = true; // booleen sur 1 bit
        char caractere = 'a'; // caractere sur 2 octet // dans la mémoire: 97

        // Faux primitif
        String chaine = "ma chaine de caractere";

        // Type référence - Les variables référence ne contiennent pas les objet mais leur adresse
        Object sc = new Object();


        // Différence référence et valeur

        int a = 5;
        int b = 5;

        Pizza p1 = new Pizza("bonne pizza"); // instanciation d'un objet poo.encaps.Pizza sur base de la classe
        Pizza p2 = new Pizza("bonne pizza");

        String s1 = "salut";
        String s2 = "salut";

        System.out.println( a == b );   // true
        System.out.println( p1 == p2 ); // false
        System.out.println( s1 == s2 ); // true
        System.out.println( p1.getNom() == p2.getNom() ); // true

        // Transtypage - Type casting

        char character = 'a';
        short entierCourt = 127;
        long entierLong = 123_456_789L;

        entierCourt = (short) entierLong;
        System.out.println("long -> short : " + entierCourt);

        int entier = (int)entierLong; // explicit type casting - perte d'info possible
        entier = entierCourt; // implicit type casting - pas de perte d'info
        entier = character;
        System.out.println( entier );


        Pizza pizza = new Pizza("pizza objet");
        Object objP = pizza;
        pizza = (Pizza) objP; // OK


        // Object obj = new Scanner(System.in);
        // Pizza pizza2 = (Pizza) obj; // CRASH

        // System.out.println(pizza.nom); // ne trouve pas l'attribut 'nom' dans l'objet
        System.out.println( ((Pizza)pizza).getNom() );

        // Les constantes

        final int MA_CONSTANTE = 4; // ne peut pas être modifié après son initialisation
        // MA_CONSTANTE = 5; // ne compile pas

        final Pizza maPizza = new Pizza("ma pizza");
        maPizza.setNom("ma pizza (modif)"); // on modifie la variable dans l'objet et pas la variable maPizza => OK
        System.out.println( maPizza.getNom() );

        // Convention de nomage

        int uneVariable; // minuscule pour les variables
        String string = pizza.getNom(); // minuscule pour les attributs
        pizza.direCoucou(); // minuscule pour les methodes
        final String DEUXIEME_CONSTANTE = "deuxieme constante"; // tout en majuscule pour les constantes



    }

}
