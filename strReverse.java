package edu;

public class strReverse {
    public static void main(String... args) throws Exception {
        
        // String reverse v1
        String str = "Mercury";
        char[] ares = new char[str.length()];
        for (int i = str.length()-1; i >= 0; i--) {
            ares[str.length()-(i+1)] = str.charAt(i);
        }
        System.out.println(str.copyValueOf(ares));


        // String reverse v2
        String str2 = "Venus";
        for(int y=0; y < str2.length(); y++){
            System.out.print(str2.charAt((str2.length()-y-1)) + "");
        }
        System.out.println();
        System.out.println(Rev("Mars"));

    }

    // method recursion
    public static String Rev(String s){
        return (s.length()>1) ? s.charAt(s.length()-1) + Rev(s.substring(0,s.length()-1)): s ;
    }
}

