package edu;

public class min_max_Arr {
    public static void main(String... args) throws Exception {
        int Arr[] = {23, 54, 67, 22, 67, 92, 8, 12};
        int max = Arr[0];
        int min = Arr[0];
        for (int i=1; i<Arr.length; i++){
            min = (Arr[i] < min) ? Arr[i] : min;
            max = (Arr[i] > max) ? Arr[i] : max;   
        }
        
        for (int k = 0; k < Arr.length; k++){
            System.out.print(Arr[k]+" ");
        }
        
        System.out.println("\nmin: "+min);
        System.out.println("max: "+max);
    }
}
