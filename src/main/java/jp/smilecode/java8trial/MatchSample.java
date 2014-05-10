package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.List;

public class MatchSample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ABC", "DEF", "GHI", "JKL");

        // すべてにmatch
        System.out.println(list.stream().allMatch(s -> s.length() == 3)); // true
        System.out.println(list.stream().allMatch(s -> s.startsWith("A"))); // false
        
        // いずれかにmatch
        System.out.println(list.stream().anyMatch(s -> s.length() == 3)); // true
        System.out.println(list.stream().anyMatch(s -> s.startsWith("A"))); // true

        // ひとつもmatchしない
        System.out.println(list.stream().noneMatch(s -> s.length() == 3)); // false
        System.out.println(list.stream().noneMatch(s -> s.length() == 4)); // true
        System.out.println(list.stream().noneMatch(s -> s.startsWith("A"))); // false
        

    }
}
