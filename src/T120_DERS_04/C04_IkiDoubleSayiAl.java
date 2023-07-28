package T120_DERS_04;

import java.util.Scanner;

public class C04_IkiDoubleSayiAl {
    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen 2 double sayi giriniz");

        double sayi1= scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        int bolmeSonucu= (int) (sayi1/sayi2);

        System.out.println("Bölme işleminin sonucu: "+bolmeSonucu);


    }
}
