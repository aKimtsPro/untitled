package poo.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

public class DemoStreamInterm {

    public static void main(String[] args) {

        List<Assiette> assiettes = new ArrayList<>();

        Assiette a =new Assiette("Crissante", 33, "rouge");

        assiettes.add(a);
        assiettes.add(a);
        assiettes.add(new Assiette("Crissante", 27, "blanche"));
        assiettes.add(new Assiette("Rondassiet", 40, "blanche"));
        assiettes.add(new Assiette("Mangéa", 33, "bleu"));
        assiettes.add(new Assiette("Mangéa", 35, "jaune"));

        // Les Streams - Opération intermédiaire

        // Récupérons les marques d'assiette qui ont des assiette dont la couleur commence par 'b'
        assiettes.stream()
                .filter( element -> {
                    System.out.println("filter : " + element);
                    return element.getCouleur().startsWith("b");
                } )
                .map( element -> {
                    System.out.println("map : " + element);
                    return element.getMarque();
                })
                .distinct()
                .forEach(System.out::println);



        // filter

        System.out.println("\n--- FILTER ---\n");
        assiettes.stream()
                .filter(element -> element.getDiametre() >= 20 && element.getDiametre() < 30 )
                .filter(element -> element.getMarque().contains("r") )
                .forEach(System.out::println);

        // map

        System.out.println("\n--- MAP ---\n");
        assiettes.stream()
                .map((element) -> new Assiette(element.getMarque(),element.getDiametre()+5,element.getCouleur()))
                .filter((element) -> element.getDiametre() >= 20 && element.getDiametre() < 30)
                .map( Assiette::getDiametre )
                .forEach(System.out::println);

        assiettes.stream()
                .mapToInt(Assiette::getDiametre)
                .mapToLong(e->e)
                .mapToDouble(e->e)
                .forEach(System.out::println);

        // flatmap

        System.out.println("\n--- FLATMAP ---\n");
        assiettes.stream()
                .map(Assiette::getMarque)
                .distinct()
                .flatMap(e -> {
                    String st1;
                    String st2;

                    int middle = e.length()/2;

                    st1 = e.substring(0, middle);
                    st2 = e.substring(middle);
                    System.out.println("FLATMAPPING - v1 : " + st1 + " - v2 : " + st2);
                    return Stream.of(st1, st2);
                })
                .filter((e) -> e.startsWith("s") || e.startsWith("S"))
                .forEach(System.out::println);
        // si il existe mapToInt, ToLong, ToDouble,
        // il existe aussi flatmapToInt, ToLong, ToDouble

        // distinct

        System.out.println("\n--- DISTINCT ---\n");
        assiettes.stream()
                .distinct()
                .forEach(System.out::println);

        // sorted

        System.out.println("--- SORTED --- ");
        assiettes.stream()
                .filter(e -> e.getDiametre() > 25) // Stream<Assiette>
//                .sorted( Comparator.comparingInt(Assiette::getDiametre).reversed() )
                .sorted() // attention avec element non Comparable
                .forEach(System.out::println);

        // Comparator : prend 2 param de mm type, renvoie un entier
        //  -> positif : 1er param plus grand
        //  -> zero : 2param egaux
        //  -> négatif: 1er param plus petit

        // peek
        // execute un consumer avec en param les éléments restants

        System.out.println("--- PEEK ---");
        assiettes.stream()
                .peek( x -> System.out.println("peek : " + x) )
                .filter(e -> e.getMarque().length() < 10)
                .forEach( x1 -> System.out.println("forEach : " + x1) );


        // skip

        System.out.println("--- SKIP ---");
        assiettes.stream()
                .sorted( Comparator.reverseOrder() )
                .skip(3)
                .forEach(System.out::println);

        // limit - court-circuit

        System.out.println("--- LIMIT ---");
        assiettes.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);


        AtomicInteger counter = new AtomicInteger();

        Stream.generate(() -> new Random().nextInt(100_000))
                .filter(e -> e <= 0 || e >= 99_999)
                .limit(100_000)
                .peek( integer -> System.out.println(counter.incrementAndGet()) )
                .forEach( System.out::println );

    }
}
