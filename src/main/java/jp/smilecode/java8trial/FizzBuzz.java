package jp.smilecode.java8trial;

import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        
        Function<Integer, String> fizzbuzz = (i) -> {
            return
                    i%3 == 0 && i%5 == 0 ? "FizzBuzz":
                    i%3 == 0 ? "Fizz":
                    i%5 == 0 ? "Buzz":
                    i.toString();
        };

        IntStream.range(1, 100)
                .mapToObj((i) -> fizzbuzz.apply(i))
                .forEach(System.out::println);
    }
}
