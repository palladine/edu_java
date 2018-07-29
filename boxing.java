package edu;

public class boxing {
    public static void main(String... args) throws Exception {
        Integer a = new Integer(100); // упаковка
        System.out.println(a.intValue());   // распаковка

        Integer b = 200;            // автоупаковка
        System.out.println(b);      // автораспаковка
    }
}
