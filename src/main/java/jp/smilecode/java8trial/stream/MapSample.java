package jp.smilecode.java8trial.stream;

import java.util.Arrays;
import java.util.List;

public class MapSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .map(i -> i * i)
                .forEach(System.out::println);
        
    }
}
