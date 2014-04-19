package jp.smilecode.java8trial;

public class StringJoinerSample1 {

    public static void main(String[] args) {
        String delimiter = "-";
        System.out.println(String.join(delimiter, "hello", "java", "8"));
    }
}
