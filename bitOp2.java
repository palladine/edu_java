package edu;

public class bitOp2 {
    public static void main(String... args) throws Exception {
        int a = -8;
        System.out.println("Число: " + a);
        System.out.println("Результат после сдвига вправо:\t" + (a >> 2));
        System.out.println("Результат после сдвига влево:\t" + (a << 2));
        System.out.println("Результат после сдвига (>>>):\t" + (a >>> 2));
        System.out.println("Binary:\t\t\t\t" + Integer.toBinaryString(a));
        System.out.println("Binary after right:\t" + Integer.toBinaryString((a >> 2)));
        System.out.println("Binary after left:\t" + Integer.toBinaryString((a << 2)));
        System.out.println("Binary after (>>>):\t" + Integer.toBinaryString((a >>> 2)));

    }
}
