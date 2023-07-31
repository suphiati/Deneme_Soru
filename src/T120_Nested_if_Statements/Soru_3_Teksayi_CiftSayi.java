package T120_Nested_if_Statements;

import java.util.Scanner;

public class Soru_3_Teksayi_CiftSayi {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
                sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        /*

        if (girilenSayi%2==0){
            System.out.println("Girilen sayi çift sayi");
            if (girilenSayi%10==0){
                System.out.println("Girilen çift sayi 10'un katıdır");
            }else {
                System.out.println("Girilen sayi 10'un katı değildir");
            }
        }else {
            System.out.println("Girilen sayi tek sayidir");
            if (girilenSayi<0){
                System.out.println("Girilen sayi negatif bir tek sayidir");
            }else {
                System.out.println("Girilen sayi pozitif bir tek sayidir");
            }
        }

        */

        if (girilenSayi%2==1){
            if (girilenSayi>0){
                System.out.println("Girilen sayi tek pozitif tamsayidir");
            }else {
                System.out.println("Girilen sayi tek negatif tamsayidir");
            }
        }else {
            if (girilenSayi%10==0){
                System.out.println("Girilen çift sayi 10'un tam katıdır");
            }else {
                System.out.println("Girilen çift sayi 10'un tam katı değildir");
            }
        }
    }
}
