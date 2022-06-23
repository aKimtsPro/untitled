package poo.classe;

import poo.encaps.Personne;
import poo.encaps.Pizza;

public class DemoClass {

    public static void main(String[] args) {

        Pizza pizza = new Pizza("spéciale");

        Personne pers = new Personne();
        pers.sePresenter();
        Pizza var = pers.confectionnerPizza(null);

        pers.getTaille();
        pers.setTaille( -178 );


        Pizza pizza1 = new Pizza( "bon" );
        pers.setPizzaPrefere( pizza1 );
        System.out.println( pers.getPizzaPrefere().getNom() ); // bon

    }
}
