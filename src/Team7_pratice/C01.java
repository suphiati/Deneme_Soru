package Team7_pratice;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

// SORU 2 -Verilen bir array’deki pozitif tamsayilari toplayip
// sonucu bize donduren bir method yaziniz.

        Scanner scanner= new Scanner(System.in);
        int [] arr={1,5,3,4,8};
        System.out.println(arrayTamsayiToplama(arr));

    }





    public static int arrayTamsayiToplama(int [] arr){

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam +=arr[i];

            }


        }
        return toplam;

    }
}
