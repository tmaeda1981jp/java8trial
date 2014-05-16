package jp.smilecode.java8trial;

import java.util.Objects;

public class ObjectsExample {

    public static void main(String[] args) {
        Object obj = null;
        System.out.println(Objects.isNull(obj)); // true
        obj = "test";
        System.out.println(Objects.nonNull(obj)); // true
        System.out.println(Objects.isNull(obj)); // false
    }
}
