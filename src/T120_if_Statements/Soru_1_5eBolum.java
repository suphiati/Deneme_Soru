package T120_if_Statements;

import java.util.Scanner;

public class Soru_1_5eBolum {
    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
                    “Sayi 5’in tam kati” yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz");
        int sayi= scanner.nextInt();

        if (sayi%5==0){
            System.out.println(sayi+" sayisi 5'in tam katıdır.");
        }
    }
}
