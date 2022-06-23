package poo.lambda;

import poo.generics.Bille;
import poo.generics.Lancable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        List<Bille> list = new ArrayList<>();
        list.forEach( (element) -> { element.setDiametre(element.getDiametre()+2); } );

        // type retour - nom - params(type, nom) - quoi faire
        // ( nom_param1, nom_param2, nom_param3 ) -> { quoi faire; }

        // Interface fonctionnelles
        Consumer<Bille> consumer = (maBille) -> maBille.setDiametre( 58 ); // ( Bille param ) -> { ... } pas de retour (void)
        Supplier<Bille> supplier = () -> { return new Bille(15); };    //  () -> { ... } retourne une bille
        Function<Integer, Bille> func = (entier) -> { return new Bille(entier + 1); }; // 1 param (Integer) + 1 retour (Bille)
        BiFunction<Bille,Bille,String> biFunc = (param1, param2) -> { return ""+(param1.getDiametre()+param2.getDiametre()); };

        Predicate<Bille> predicate = ( maBille ) -> { return maBille.getDiametre() > 15; }; // 1 param (Bille) + 1 retour boolean7

        Function<Bille, Bille> func2 = (param) -> { return new Bille(param.getDiametre()); };
        UnaryOperator<Bille> unaryOperator = (param) -> { return new Bille(param.getDiametre()); };

        BiFunction<Bille, Bille, Bille> biFunc1 = (param1, param2) -> { return new Bille(param1.getDiametre()+param2.getDiametre()); };
        BinaryOperator<Bille> binaryOperator = (param1, param2) -> { return new Bille(param1.getDiametre()+param2.getDiametre()); };


        list.stream().filter( predicate );

        Lancable b = () -> { return 18; };
        System.out.println( b.lancer() );

        Deplacable deplacable = () -> System.out.println("je porte");

        System.out.println(b);
        System.out.println(deplacable);

        LancableIntensite li = i -> { return 210 + i; };
        li = i -> 210 + i; // meme chose / si une seule instruction: il est possible de : pas de {} et de return
        System.out.println( li.lancer(30) );

        Function<Integer, Bille> func3 = Bille::new;

        Bille bille = new Bille(15);
        IntSupplier intSup = bille::getDiametre;
        intSup.getAsInt();

        IntSupplier supplier1 = new IntSupplier() {
            @Override
            public int getAsInt() {
                return bille.getDiametre();
            }
        };

        ToIntFunction<Bille> toInt = Bille::getDiametre;
        toInt.applyAsInt(bille);

        ToIntFunction<Bille> toInt2 = new ToIntFunction<Bille>() {
            @Override
            public int applyAsInt(Bille value) {
                return value.getDiametre();
            }
        };

    }
}
