package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComputeIfPresentSample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "abc");
        map.put("b", "bcd");
        map.put("c", "cde");

        Arrays.asList("a", "c", "f").stream()
                .forEach(key -> {
                    map.computeIfPresent(key, (k, v) -> v.toUpperCase());
                });
        System.out.println(map);
    }
}
