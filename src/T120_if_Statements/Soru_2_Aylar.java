package T120_if_Statements;

import java.util.Scanner;

public class Soru_2_Aylar {
    public static void main(String[] args) {

        /*
          Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
                 NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                     Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scanner.next().toUpperCase().charAt(0);


        if (harf == 'O') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Ocak");
        }
        if (harf == 'Ş') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Şubat");
        }
        if (harf == 'M') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Mart, Mayıs");
        }
        if (harf == 'N') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Nisan");
        }
        if (harf == 'H') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Haziran");
        }
        if (harf == 'T') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Temmuz");
        }
        if (harf == 'A') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Ağustos, Aralık");
        }
        if ( harf == 'E') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Eylül, Ekim");
        }
        if (harf == 'K') {
            System.out.print("Girilen " + harf + " harfi ile başlayan aylar: Kasım");
        }
    }
}
