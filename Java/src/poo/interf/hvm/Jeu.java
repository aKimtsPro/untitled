package poo.interf.hvm;

import java.util.Random;

public class Jeu {

    public static void main(String[] args) {

        int inventaireCuir = 0;
        int inventaireOr = 0;

        Monstre m = createMonstre();

        System.out.println( m.getClass().getSimpleName() );

        if( m instanceof Or ){
            inventaireOr += ((Or) m).recupererOr();
        }
        if( m instanceof Cuir ){
            inventaireCuir += ((Cuir) m).recupererCuir();
        }

        System.out.println("or : " + inventaireOr);
        System.out.println("cuir : " + inventaireCuir);

    }

    public static Monstre createMonstre(){

        switch( new Random().nextInt(3) ){
            case 0:
                return new Loup("loup");
            case 1:
                return new Orc("orc");
            case 2:
                return new Dragon("dragon");
        }
        return null;
    }

}
