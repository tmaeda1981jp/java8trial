package jp.smilecode.java8trial;

public class FunctionalInterfaceSample {

    public static void main(String[] args) {
        Counter counter = (s1, s2) -> s1.length() + s2.length();
        System.out.println(counter.count("abc", "de"));

        int result = ((Counter) (s1, s2) -> s1.length() + s2.length())
                .count("abc", "de");
        System.out.println(result);

    }
}

@FunctionalInterface
interface Counter {

    int count(String s1, String s2);
}
