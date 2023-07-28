package Tema7_pratice;

import java.util.Arrays;

public class C02 {

    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.


        int [] arr={5,8,8,6,4};
        arr=sayiArtirma(arr);


        System.out.println(Arrays.toString(arr));

    }
    public static int[] sayiArtirma(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 2;
        }
        return arr;
    }
}
