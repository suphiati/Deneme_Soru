package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_4_dortgenAlanHesabi {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanını yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kısa kenar uzunluğunu giriniz: ");
        double kisaKenar= scanner.nextDouble();
        System.out.println("Lütfen dikdörtgenin uzun kenar uzunluğunu giriniz: ");
        double uzunKenar= scanner.nextDouble();

        double dortgenAlani= kisaKenar*uzunKenar;
        System.out.println("Dİkdörtgenin Alanı: "+dortgenAlani);


    }
}
