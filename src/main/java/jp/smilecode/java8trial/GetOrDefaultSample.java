package jp.smilecode.java8trial;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultSample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "abc");
        map.put("b", "bcd");
        map.put("c", "cde");

        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        System.out.println(map.get("d"));

        System.out.println(map.getOrDefault("a", "DEFAULT"));
        System.out.println(map.getOrDefault("b", "DEFAULT"));
        System.out.println(map.getOrDefault("c", "DEFAULT"));
        System.out.println(map.getOrDefault("d", "DEFAULT"));
    }
}
