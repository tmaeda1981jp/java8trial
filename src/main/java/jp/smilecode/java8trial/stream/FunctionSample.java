package jp.smilecode.java8trial.stream;

import java.util.function.Function;

public class FunctionSample {
    public static void main(String[] args) {
        Function<Integer, String> toYen = yen -> String.format("%d円", yen);
        System.out.println(toYen.apply(2500));
    }
}
