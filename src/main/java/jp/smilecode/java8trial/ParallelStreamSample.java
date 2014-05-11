package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamSample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DEF", "GHI", "JKL");
        list.stream()
                .forEach(System.out::println);
        System.out.println("----");
        list.parallelStream()
                .forEach(System.out::println);
        
        System.out.println("----");
        IntStream.range(1, 100).parallel().forEach(System.out::println);
    }
}
