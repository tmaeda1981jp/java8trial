package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReplaceAllSample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);
        
        HashMap<String, String> map = new HashMap();
        map.put("A", "ABC");
        map.put("B", "BCD");
        map.put("C", "CDE");

        map.replaceAll((k, v) -> v.toLowerCase());
        System.out.println(map);        
    }
}
