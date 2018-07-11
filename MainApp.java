package edu;

import org.apache.camel.main.Main;

public class MainApp {
    public static void main(String... args) throws Exception {
        /*
        You have an array of numbers.
        Your task is to sort ascending odd numbers but even numbers must be on their places.
        Zero isn't an odd number and you don't need to move it.
        If you have an empty array, you need to return it.
        */
        int[] arr = {5, 3, 2, 8, 0, 3, 1, 4};

        for (int i = 0; i <= arr.length-1; i++){
            for (int j = i+1; j <= arr.length-1; j++){
                if ((arr[i] > arr[j])
                        & (arr[i]%2 != 0)
                        & (arr[j]%2 != 0)
                        & (arr[i] != 0)
                        & (arr[j] != 0)) {
                        int tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                }
            }
        }

        /*
        for (int i = arr.length - 2; i >= 0; i -= 2) {
            for(int j = 0 ; j < i ; j += 2){
                if( (arr[j] > arr[j+2]) & (arr[j+2] != 0) ){
                    int tmp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = tmp;
                }
            }
        }*/
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}