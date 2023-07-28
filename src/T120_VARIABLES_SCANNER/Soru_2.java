package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimi yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif ondalıklı bir sayı giriniz: ");
        double db= scanner.nextDouble();

        System.out.println("Lütfen pozitif bir tamsayi giriniz: ");
        int sayi= scanner.nextInt();

        double sayilarToplami= sayi+db;
        double sayilarCarpimi= sayi*db;

        System.out.println("İki sayının toplamı: "+sayilarToplami);
        System.out.println("İki sayinin çarpımı: "+sayilarCarpimi);



    }
}
