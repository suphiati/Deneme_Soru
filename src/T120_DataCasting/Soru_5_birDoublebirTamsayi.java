package T120_DataCasting;

import java.util.Scanner;

public class Soru_5_birDoublebirTamsayi {
    public static void main(String[] args) {

        /*
           Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
                   ve bolum isleminin sonucununun tamsayi kismini yazdirin.
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz:");
        double sayi1= scanner.nextDouble();
        System.out.println("Lütfen pozitif bir tamsayi giriniz");
        int sayi2= scanner.nextInt();

        int bolum= (int) (sayi1/sayi2);
        System.out.println("Bölüm işleminin tamsayı değeri: "+bolum);
    }
}
