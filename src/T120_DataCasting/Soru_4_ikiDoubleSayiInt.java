package T120_DataCasting;

import java.util.Scanner;

public class Soru_4_ikiDoubleSayiInt {
    public static void main(String[] args) {

        /*
           Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
                   isleminin sonucununun tamsayi kismini yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen ilk pozitif sayiyi giriniz");
        double sayi1= scanner.nextDouble();
        System.out.println("Lütfen ikinci pozitif sayiyi giriniz");
        double sayi2= scanner.nextDouble();

        int bolum= (int) (sayi1/sayi2);
        System.out.println("İlk sayının ikinci sayıya bölümünün tamsayı değeri: "+bolum);

    }
}
