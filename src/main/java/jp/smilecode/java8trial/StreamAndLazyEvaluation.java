package jp.smilecode.java8trial;

import java.util.stream.IntStream;
//import java.util.stream.Stream;

public class StreamAndLazyEvaluation {
   
    public static void main(String[] args) {
        //Stream<Integer> stream = Stream.iterate(1, i -> i++);
        IntStream stream = IntStream.range(1, 100);
        stream.limit(20).forEach(System.out::println);
    }
}
