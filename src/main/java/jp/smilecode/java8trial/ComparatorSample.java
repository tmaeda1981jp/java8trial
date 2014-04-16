package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.List;

public class ComparatorSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java", "Groovy", "Scala", "Python", "Ruby", "Perl", "C"
        );
        System.out.println(list);
        list.sort((String s1, String s2) -> s1.length() - s2.length());
        System.out.println(list);
    }
}
