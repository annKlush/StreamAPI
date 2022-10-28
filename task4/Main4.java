package task4;

import java.lang.Math;
import java.lang.Long;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main4 {
    public static void main(String[] args) {
        Task4 rand = new Task4(25214903917L, 11, Math.pow(2, 48));
        Stream<Long> longStream = Stream.iterate(41335430L, seed -> rand.seed(seed).next());
        longStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}
