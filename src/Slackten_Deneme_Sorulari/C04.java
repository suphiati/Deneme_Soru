package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // Soru 4-)   SCANNER
        //Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen işlem yapmak istediğiniz bir sayi giriniz: ");

        double sayi= scanner.nextDouble();

        double kupununYarisi= (sayi*sayi*sayi)/2;

        System.out.println("Girmiş olduğunuz "+sayi+" sayısının küpünün yarısının değeri :"+ kupununYarisi);
    }
}
