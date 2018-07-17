package edu;

public class factor {

    public static int factor(int n) {
        return (n != 0) ? (n * factor(n - 1)) : 1;
    }


    public static void main(String... args) throws Exception {
        System.out.println(factor(6));
    }
}

