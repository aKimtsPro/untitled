package poo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreationStream {

    public static void main(String[] args) {


        List<Assiette> assiettes = new ArrayList<>();

        Assiette a =new Assiette("Crissante", 33, "rouge");

        assiettes.add(a);
        assiettes.add(a);
        assiettes.add(new Assiette("Crissante", 27, "blanche"));
        assiettes.add(new Assiette("Rondassiet", 40, "blanche"));
        assiettes.add(new Assiette("Mangéa", 33, "bleu"));
        assiettes.add(new Assiette("Mangéa", 35, "jaune"));


        // Les Streams - Creation

        Stream<Assiette> stream = assiettes.stream();
        Stream<Integer> stream1 = Stream.of(12,15,18,28);
        stream1 = Stream.empty();
        stream1 = Stream.iterate(0, precedent -> precedent+1 ); // infini
        stream1 = Stream.iterate(0, precedent -> precedent >= 0, precedent -> precedent+1); // (in)fini
        stream1 = Stream.generate( () -> new Random().nextInt(10)+1 ); // infini

        IntStream s1;
        DoubleStream s2;
        LongStream s3 = LongStream.range(0L,15L);
        s3 = LongStream.rangeClosed(0L,15L);
    }

}
