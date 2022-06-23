package poo.streams;

import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        // IntStream.rangeClosed(0,15).forEach(System.out::println);


        long before = System.currentTimeMillis();
        IntStream.range(0, 100000)
                .parallel()
                .forEach(System.out::println);
//        for (int i = 0; i < 100000; i++) {
//            System.out.println(i);
//        }
        long after = System.currentTimeMillis();

        System.out.println(after-before + "millis");


    }

}
