package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        // Soru 7-)  Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        //(Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        //ipuclari:
        //( Data Casting -> Auto Widening ve Explicit Narrowing )

        Scanner scanner= new Scanner(System.in);
        System.out.print("Lütfen double bir sayı giriniz: ");
        double sayi= scanner.nextDouble();

        int degistirilenSayi= (int) sayi;

        System.out.print("Girilen sayının tamsayı olarak değeri: "+degistirilenSayi);
    }
}
