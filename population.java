
package edu;

public class population {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
         //p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)

        for(int i = 1;;i++){
          p0 += (int)(p0*(percent / 100)) + aug;
          if (p0 >= p){
              return i;
          } 
        }
    }
    
    public static void main(String... args) throws Exception {
        System.out.println(nbYear(1500000, 0.25, 1000, 2000000));
    }
    
     
}
