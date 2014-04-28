package jp.smilecode.java8trial;

import java.util.stream.IntStream;

// http://projecteuler.net/problem=1
public class ProjectEulerProblem1 {

    public static void main(String[] args) {
        int result = IntStream.range(1, 1000)
                .filter(i -> i%3 == 0 || i%5 == 0)
                .reduce(0, (sum, i) -> sum + i);

        System.out.println(result);
                
    }
}
