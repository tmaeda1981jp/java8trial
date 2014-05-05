package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComputeIfSample {

    static Map<String, String> createMap() {
        Map<String, String> map = new HashMap();
        map.put("a", "abc");
        map.put("b", "bcd");
        map.put("c", "cde");
        return map;
    }
    
    public static void main(String[] args) {
        
        Map<String, String> map = createMap();
        Arrays.asList("a", "c", "f").stream()
                .forEach(key -> {
                    // 指定したキーが存在する場合に，lambdaの戻り値でmapをupdate
                    map.computeIfPresent(key, (k, v) -> v.toUpperCase());
                });
        System.out.println(map);
        
        Map<String, String> map2 = createMap();
        Arrays.asList("a", "c", "d", "f").stream()
                .forEach(key -> {
                    // 指定したキーが存在しない場合に，lambdaの内容でmapをappend
                    map2.computeIfAbsent(key, (k) -> "---");
                });
        System.out.println(map2);
    }
}
