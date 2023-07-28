package T120_DERS_04;

import java.util.Scanner;

public class C02_harfalip_Alfabedensonraki_ucHarfiYazdır {
    public static void main(String[] args) {

        // Kullanıcıdan bir harf alın,
        // ve alfabede bu harften sonraki 3 harfi yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        char girilenKarakter= scanner.next().charAt(0);

        System.out.println("Girilen karakter: " + girilenKarakter);
        System.out.println("Girilen karakterden sonraki 3 harf: "
                         + (char)(girilenKarakter+1)+", " +(char)(girilenKarakter+2)+", "+ (char)(girilenKarakter+3));



    }
}
