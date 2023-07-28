package T120_DERS_05;

import java.util.Scanner;

public class C02_harfAl_basHarfBuyukOlsun {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char ilkHarf= scanner.next().charAt(0);



        if (ilkHarf=='O' || ilkHarf=='o'){
            System.out.println("Ocak");
        }
        if (ilkHarf=='S' || ilkHarf=='s'){
            System.out.println("Şubat");
        }
        if (ilkHarf=='M' || ilkHarf=='m'){
            System.out.println("Mart, Mayıs");
        }
        if (ilkHarf=='N' || ilkHarf=='n'){
            System.out.println("Nisan");
        }
        if (ilkHarf=='H' || ilkHarf=='h'){
            System.out.println("Haziran");
        }
        if (ilkHarf=='T' || ilkHarf=='t'){
            System.out.println("Temmuz");
        }
        if (ilkHarf=='A' || ilkHarf=='a'){
            System.out.println("Ağustos, Aralık");
        }
        if (ilkHarf=='E' || ilkHarf=='e'){
            System.out.println("Eylül, Ekim");
        }
        if (ilkHarf=='K' || ilkHarf=='k'){
            System.out.println("Kasım");
        }
    }
}
