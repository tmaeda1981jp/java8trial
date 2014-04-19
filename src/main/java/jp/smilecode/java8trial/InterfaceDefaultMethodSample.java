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
        
        // 関数型インターフェースじゃないのでこの書き方はNG
        // ((Printable)(str) -> System.out.printf("[[ %s ]]\n", str)).print("hoge");
        
        // こちらは関数型インターフェースなのでこの書き方でOK
        ((Writable) str -> System.out.printf("[[ %s ]]\n", str)).write("hoge");
    }
}


// 抽象メソッドがひとつもないので関数型インターフェースじゃない
// @FunctionalInterface
interface Printable {
    default public void print(String str) {
        System.out.println(str);
    }
}

// 抽象メソッドがひとつだけなので関数型インターフェース
@FunctionalInterface
interface Writable {
    void write(String str);   
}