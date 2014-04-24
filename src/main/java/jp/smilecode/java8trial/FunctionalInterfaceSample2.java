package jp.smilecode.java8trial;

import java.util.Date;

public class FunctionalInterfaceSample2 {

    public static void main(String[] args) {
        Function<Date> f1 = Date::new;
        Date date = f1.apply();
        System.out.println(date);
        
        Function2<String> f2 = (str) -> (str);
        String str = f2.apply("test");
        System.out.println(str);
    }
    
    @FunctionalInterface
    interface Function<T> {
        T apply();
    }
    
    @FunctionalInterface
    interface Function2<T> {
        T apply(String str);
    }
}
