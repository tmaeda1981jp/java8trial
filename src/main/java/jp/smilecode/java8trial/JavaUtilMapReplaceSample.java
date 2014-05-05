package jp.smilecode.java8trial;

import java.util.HashMap;
import java.util.Map;

public class JavaUtilMapReplaceSample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("a", "abc");
        map.put("b", "bcd");
        map.put("c", "cde");
        
        // 指定のキーに対応する値を置換
        map.replace("a", "ABC");
        System.out.println(map);
        
        // 値が存在して且つそれが一致した場合のみ置換
        map.replace("a", "zzz", "new");
        map.replace("b", "bcd", "new");
        System.out.println(map);
    }
}
