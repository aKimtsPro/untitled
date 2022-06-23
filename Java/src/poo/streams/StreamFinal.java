package poo.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFinal {

    public static void main(String[] args) {


        // Opérations terminales

        // forEach

        Stream<Integer> s = generateStream();
//                .peek(System.out::println); // possible
        System.out.println("--- FOREACH ---");
        s.forEach( System.out::println );
//        s.peek(System.out::println); // impossible (le stream est fermé)

        // min/max

        System.out.println("--- MIN/MAX ---");
        s = generateStream();
        Optional<Integer> opt = s.min( Integer::compareTo );
        System.out.println( opt.get() );

        s = generateStream();
        System.out.println( s.max( Integer::compareTo ).get() );

        // count

        System.out.println("--- COUNT ---");
        s = generateStream()
                .filter(e -> e%2 == 0);
        System.out.println( s.count() );

        // anyMatch / allMatch / noneMatch - court-circuit

        System.out.println("--- XXXMatch ---");
        s = generateStream();

        // Verifie si la somme des chiffres d'au moins un des éléments restants est 13
        boolean verif = s.noneMatch( (e) -> {
            int copy = e, sum = 0;
            while( copy > 0 ){
                sum += copy % 10;
                copy /= 10;
            }
            return sum == 13;
        });
        System.out.println( verif );


        // findFirst / findAny - court-circuit

        System.out.println("--- findAny / findFirst ---");
        s = generateStream()
                .filter((e) -> {
                    int copy = e, sum = 0;
                    while( copy > 0 ){
                        sum += copy % 10;
                        copy /= 10;
                    }
                    return sum == 13;
                });

        opt = s.findFirst();
        // opt = s.findAny();
        System.out.println( opt.get() );


        // reduce
        System.out.println("--- reduce ---");
        s = generateStream();
//            .filter(e -> e > 100);

        opt = s.reduce( (acc, add) ->  acc+add );
        System.out.println(  opt.get() );

        s = generateStream();
        int value = s.reduce( 0,(acc, add) -> add%2 == 0 ? acc - add : acc + add);

        // collect
        System.out.println("--- COLLECT ---");
        s = generateStream();

//        Collection<Integer> list = s.collect(Collectors.toCollection(LinkedList::new));
//        Collection<Integer> list  = s.collect(Collectors.toUnmodifiableList());
        Collection<Integer> list = s.collect(Collectors.toList()); // ArrayList
//        Collection<Integer> list = s.collect(Collectors.toSet()); // HashSet
//        Map<Integer, Integer> map = s.collect(Collectors.toMap( e -> e, e -> e ));
        System.out.println( list.getClass().getSimpleName() );



    }

    public static Stream<Integer> generateStream(){
        Random random = new Random();
        return Stream.generate( () -> random.nextInt(100) )
                .limit(100);
    }

}
