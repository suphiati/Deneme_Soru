package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        // Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        //               Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye
        //         Ipucu:
        //         Saati alıp saniyeye cevirebilirsiniz.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen saniyeye çevirmek istediğiniz süreyi saat dakika ve saniye olarak giriniz");

        System.out.println("Lütfen saat giriniz");
        int saat= scanner.nextInt();

        System.out.println("Lütfen dakika giriniz");
        int dakika= scanner.nextInt();

        System.out.println("Lütfen saniye giriniz");
        int saniye= scanner.nextInt();

        int toplamSaniye= saniye+60*dakika+3600*saat;

        System.out.println("Girilen sürenin saniye cinsinden toplam değeri: "+toplamSaniye+" dir");
    }
}
