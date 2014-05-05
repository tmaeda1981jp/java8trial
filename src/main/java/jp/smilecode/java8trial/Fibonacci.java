package jp.smilecode.java8trial;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Fibonacci {
    
    private static final Map<Integer, Integer> fibonacciSequence = new HashMap();
    static {
        fibonacciSequence.put(0, 1);
        fibonacciSequence.put(1, 1);
    }
    
    public static int fibonacci(int n) {
        return fibonacciSequence.computeIfAbsent(n, i -> {
            return Math.addExact(fibonacci(i-1), fibonacci(i-2));
        });
    }

    public static void main(String[] args) {
        try {
            IntStream.range(2, 100).forEach(i -> fibonacci(i));            
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println(fibonacciSequence.values());            
        }
    }
}

