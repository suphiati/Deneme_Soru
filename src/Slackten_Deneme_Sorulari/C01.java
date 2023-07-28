package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Soru 1-)   SOUT/SYSO
        //Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        //Ipuclari:
        //* r=7;
        //* Pi=3.14
        //* Dairenin Cevresi : 2*Pi*r
        //* Dairenin Alani : Pi*r*r

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen çevresini ve alanını hesaplamak istediğiniz dairenin yarıçapını giriniz");

        double yaricap= scanner.nextDouble();

        double daireCevre= 2*3.14*yaricap;
        double daireAlan= 3.14*yaricap*yaricap;
        System.out.println("Dairenin çevresi: " + daireCevre);
        System.out.println("Dairenin Alanı: "+ daireAlan);
    }
}
