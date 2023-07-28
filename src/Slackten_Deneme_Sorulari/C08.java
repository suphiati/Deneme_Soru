package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        // Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        //          Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        // ipuclari:
        // Matematiksel Islemler konusuna bakalim.
        // Bölme islemi kullanarak sayinin basamaklarini alalim ve toplam adli bir konteynira (Variable) atalim.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");

        int girilenSayi= scanner.nextInt();

        int birlerBasamagi=0;
        int rakamalarToplami=0;

        birlerBasamagi=girilenSayi%10;
        rakamalarToplami=birlerBasamagi+rakamalarToplami;

        girilenSayi=girilenSayi/10;
        birlerBasamagi=girilenSayi%10;

        rakamalarToplami=birlerBasamagi+rakamalarToplami;

        girilenSayi=girilenSayi/10;
        birlerBasamagi=girilenSayi%10;

        rakamalarToplami=rakamalarToplami+birlerBasamagi;

        System.out.println("3 basamaklı sayının rakamlar toplamı: "+rakamalarToplami);





    }
}
