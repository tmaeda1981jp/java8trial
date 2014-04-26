package jp.smilecode.java8trial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfSample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list.getClass());
        list.removeIf(n -> (n % 3 == 0));
        System.out.println(list);
        
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list2.getClass());
        list2.removeIf(n -> (n % 3 == 0)); // throw UnsupportedOperationException
    }
}
