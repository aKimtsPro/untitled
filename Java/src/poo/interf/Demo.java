package poo.interf;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<Roulant> list = new ArrayList<>();

        list.add( new Voiture("pol") );
        list.add( new Ballon() );
        list.add( new Pneu() );


    }

    public static void faireRouler( Roulant aFaireRouler ){
        aFaireRouler.rouler();
    }
}
