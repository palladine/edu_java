package edu;

public class bitOp {
    public static void main(String... args) throws Exception {
        
        char a = 'a';
        System.out.println((int) a);
        // 65503, 223, 95  - сравнение шестого бита, разница между малой и большой буквой в 32
        System.out.println(((int) a) & 95);
        //System.out.println(Integer.toBinaryString((int) a));
        //System.out.println(Integer.toBinaryString(95));
        //System.out.println(Integer.parseInt("11011111",2));
        
        for (int n = 0; n < 26; n++){
       
            System.out.print(((char) (((int) a+n) & 95)));
            System.out.print((char)(a+n) + " ");
                    
        }
    }
}
