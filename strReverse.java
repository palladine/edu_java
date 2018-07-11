package edu;

public class strReverse {
    public static void main(String... args) throws Exception {
        String str = "maksimus";
        char[] ares = new char[str.length()];
        for (int i = str.length()-1; i >= 0; i--) {
            ares[str.length()-(i+1)] = str.charAt(i);
        }
        System.out.println(str.copyValueOf(ares));
    }
}

