package jp.smilecode.java8trial;

public class InterfaceDefaultMethodSample {
    public static void main(String[] args) {
        new Printable() {
            @Override
            public void print(String str) {
                System.out.printf("<< %s >>\n", str);
            }
        }.print("test");
        new Printable(){}.print("test");
        
        // NG
        // ((Printable)(str) -> System.out.printf("[[ %s ]]\n", str)).print("hoge");
        
        // OK
        ((Writable) (str) -> System.out.printf("[[ %s ]]\n", str)).write("hoge");
    }
}


interface Printable {
    default public void print(String str) {
        System.out.println(str);
    }
}

interface Writable {
    void write(String str);   
}