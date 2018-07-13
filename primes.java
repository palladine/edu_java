package edu;

public class primes {
    public static void main(String... args) throws Exception {
        int del=0;
        for (int i = 2;  i <= 100; i++){
            for (int j = 1; j <= 100; j++ ){
                if (i % j == 0){
                    del++;
                }
            }
            if (del == 2) {
                System.out.print(i + " ");
            }
            del = 0;
        }
    }
}
