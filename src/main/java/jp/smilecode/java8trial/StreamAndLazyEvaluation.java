package jp.smilecode.java8trial;

import java.util.stream.Stream;


public class StreamAndLazyEvaluation {
   
    public static void main(String[] args) {
        Stream.iterate(1, x -> x++) // 無限リスト
                .limit(100)
                .forEach(System.out::println);
                
    }
}
