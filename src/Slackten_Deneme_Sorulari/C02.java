package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        // Soru-2)   SOUT/SYSO
        //Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        //Ipuclari:
        //* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        //* Dikdortgenin Alani : uzun kenar * kisa kenar

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen çevresini ve alanını hesaplamak istediğiniz dikdörtgenin kenar uzunluklarını giriniz");

        System.out.print("Dikdörtgenin kısa kenar uzunluğunu giriniz: ");
        double kisaKenar= scanner.nextDouble();
        System.out.print("Dikdörtgenin uzun kenar uzunluğunu giriniz: ");
        double uzunKenar= scanner.nextDouble();

        double dikdortgenCevre= kisaKenar+uzunKenar;
        double dikdortgenAlani= kisaKenar*uzunKenar;
        System.out.println("Dikdörtgenin çevresi: "+dikdortgenCevre);
        System.out.println("Dkdörtgenin alanı: "+dikdortgenAlani);
    }
}
