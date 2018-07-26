package edu;

public class strReverse {
    public static void main(String... args) throws Exception {
        
        // String reverse
        String str = "maksimus";
        char[] ares = new char[str.length()];
        for (int i = str.length()-1; i >= 0; i--) {
            ares[str.length()-(i+1)] = str.charAt(i);
        }
        System.out.println(str.copyValueOf(ares));
        
        
        // Array reverse
        int Arr[] = {1,2,3,4,5};
        for(int x : Arr)
        {   
            System.out.print((Arr[Arr.length-x]) + " ");  
        }
        
        // String reverse
        String str2 = "Superbien";
        for(int y=0; y < str2.length(); y++){
            System.out.print(str2.charAt((str2.length()-y-1)) + " ");
        }
        
        
    }
}

