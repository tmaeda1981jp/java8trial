package jp.smilecode.java8trial;

import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        Optional<String> str1 = Optional.empty();
        // 実行されない
        str1.ifPresent(s -> System.out.println(str1.get()));
        System.out.println(str1.orElse("default")); // default
        
        Optional<String> str2 = Optional.of("test");
        // 実行される
        str2.ifPresent(s -> System.out.println(str2.get()));
        System.out.println(str2.orElse("default")); // test
        
    }
}
