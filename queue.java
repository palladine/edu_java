package edu;
import java.util.Arrays;

public class queue {
    public static void main(String... args) throws Exception {
        int[] customers = { 1, 2, 3, 4, 5 }; // количество покупателей + минуты необходимые на кассе
        int n = 1000;           // количество очередей

        if ((customers.length > n) & (customers.length > 1)){
            int[] mx = new int[n];
            for (int k = 0; k<n; k++) {
                mx[k] = customers[k];
            }

            for(int i = n; i<customers.length;i++){
                Arrays.sort(mx);
                mx[0] += customers[i];
            }
            Arrays.sort(mx);
            //return mx[n-1];
            System.out.println(mx[n-1]);
        }

        else if ((customers.length <= n) & (customers.length > 1)) {
            Arrays.sort(customers);
            //return customers[customers.length-1];
            System.out.println(customers[customers.length-1]);
        }

        else if ((customers.length <= n) & (customers.length == 1)) {
            //return customers[0];
            System.out.println(customers[0]);
        }

        else {//return 0;
            System.out.println("0");
             }
        }



    }
