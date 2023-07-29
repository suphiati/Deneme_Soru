package T120_DataCasting;

import java.util.Scanner;

public class Soru_3_degerSinirlariArasinda {
    public static void main(String[] args) {

        /*
           Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
                   ile 127 arasindaki bir sayiya donusturup yazdirin.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz:");
        int sayi= scanner.nextInt();
        byte sayi2= (byte) sayi;
        System.out.println("Byte sınırlarında sayinin değeri:"+sayi2);

    }
}
