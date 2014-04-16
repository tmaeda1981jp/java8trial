package jp.smilecode.java8trial;

public class FunctionalInterfaceSample {
    interface Counter { int count(String s1, String s2); }
    public static void main(String[] args) {
        Counter counter = (s1, s2) -> s1.length() + s2.length();
        System.out.println(counter.count("abc", "de"));
    }
}
