package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        //Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        //1 kg = 1000 gram      olarak hesaplayınç
        // Ipuclari:
        //  Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin


        Scanner scanner= new Scanner(System.in);
        System.out.println("Günde kaç bardak çay içiyorsunuz?");
        int gunlukCay= scanner.nextInt();

        System.out.println("Bir bardak çay için kaç adet şeker kullanıyorsunuz?");
        double birBardakicinSekerMiktari= scanner.nextDouble();

        double gunlukSekerMiktarigram= birBardakicinSekerMiktari*gunlukCay*1.5;

        System.out.println("Bir yılda içilen çay miktarı: "+gunlukCay*365+" bardak çay.");
        System.out.println("Bir yılda kullanılan şeker miktarı: "+gunlukSekerMiktarigram*365/1000+" kg şeker.");



    }
}
