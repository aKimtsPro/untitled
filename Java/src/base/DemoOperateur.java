package base;

import poo.encaps.Pizza;

public class DemoOperateur {

    public static void main(String[] args) {

        int a = 7;
        int b = 2;

        // Opérateur arithmétique

        System.out.println( a + b );        // 9
        System.out.println( a - b );        // 5
        System.out.println( a * b );        // 14
        System.out.println( a / b );        // 3 // division entiere (2 entiers)
        System.out.println( a / (float)b ); // 3.5 // division classique (au moins un float ou double)
        System.out.println( a % b );        // 1

        // 7 / 2 = ( 3 * 2 ) + 1

        // Opérateur d'affectation

        a = 5;
        a -= 2;   // a = a - 2;
        a += 2;
        a *= 2;
        a /= 2;   // Attention division entiere
        a %= 2;

        a--; // a -= 1;
        a++; // a += 1;

        System.out.println(" ---------------------- ");

        a = 0;
        System.out.println( ++a ); // 1 // pre-inc : fait l'incrémentation avant
        System.out.println( a++ ); // 1 // post-inc : fait l'incrémentation après
        System.out.println( a-- ); // 2 // post-dec : fait la décrémentation après
        System.out.println( --a ); // 0 // pre-dec : fait la décrémentation avant

        // Opérateur de comparaison

        a = 5;
        b = 5;

        System.out.println( a == b ); // true
        System.out.println( a != b ); // false

        System.out.println( a < b );  // false
        System.out.println( a <= b ); // true
        System.out.println( a > b );  // false
        System.out.println( a >= b ); // true

        Pizza pizzaA = new Pizza("pizza A");
        Pizza pizzaB = new Pizza("pizza B");
        Pizza pizzaC = pizzaA;

        System.out.println( pizzaA == pizzaB ); // false    // pas le même objet
        System.out.println( pizzaA == pizzaC ); // true     // le même objet

        // Opérateur logique

        boolean bagIsBeautiful = true;
        boolean bagIsBlue = false;

        System.out.println( bagIsBeautiful && bagIsBlue );  // AND   // false
        System.out.println( bagIsBeautiful || bagIsBlue );  // OR    // true
        System.out.println( !bagIsBlue );                   // NOT   // true

        // AND
        System.out.println( true && true ); // true
        System.out.println( true && false ); // false
        System.out.println( false && true ); // false
        System.out.println( false && false ); // false

        // OR
        System.out.println( true || true ); // true
        System.out.println( true || false ); // true
        System.out.println( false || true ); // true
        System.out.println( false || false ); // false

        // NOT
        System.out.println( !true ); // false
        System.out.println( !false ); // true

        // Loi de De Morgan

        System.out.println( !(bagIsBeautiful && bagIsBlue) );   // true
        System.out.println( !bagIsBeautiful || !bagIsBlue  );   // true

        System.out.println( !( bagIsBeautiful || bagIsBlue ) ); // false
        System.out.println( !bagIsBeautiful && !bagIsBlue );    // false

    }

}
