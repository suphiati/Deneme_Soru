package T120_DERS_04;

import java.util.Scanner;

public class C05_birDoublebirTamsayi {
    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir double değer giriniz");
        double db= scan.nextDouble();
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi= scan.nextInt();

        int sonuc= (int) db/sayi;
        System.out.println("Bölme işlemi sonucu: "+sonuc);
    }
}
