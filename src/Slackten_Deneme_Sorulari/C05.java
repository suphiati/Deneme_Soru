package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        //Soru 5-)   SCANNER
        //Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        //Ipuclari:
        //Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)

        Scanner scanner= new Scanner(System.in);

        System.out.print("Lütfen karenin kenar uzunluğunu giriniz: ");

        double kenar= scanner.nextDouble();

        double kareAlani= kenar*kenar;
        double kareCevre= kenar*4;

        System.out.println("Karenin çevre uzunluğu: "+kareCevre);
        System.out.println("Karenin alanı: "+kareAlani);


    }
}
