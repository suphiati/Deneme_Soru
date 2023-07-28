package T120_DERS_04;

import java.util.Scanner;

public class C03_hangiDegerGirse_belliSayiAraligiVerme {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        int sayi= scanner.nextInt();

        byte donusturulenSayi= (byte) sayi;

        System.out.println(donusturulenSayi);





    }
}
