package exo.polymorphisme;

public class Program {

    public static void main(String[] args) {

        Personne p1 = new Personne("marie");
        Personne p2 = new Personne("julia");

        System.out.println("-----------------");
        p1.saluer();

        System.out.println("-----------------");
        p1.saluer(3);

        System.out.println("-----------------");
        p1.saluer( p2 );

        System.out.println("-----------------");
        p1.saluer( 3, p2 );

        System.out.println("-----------------");
        p1.saluer( p2, 3 );

    }

}
