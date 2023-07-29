package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_3 {
    public static void main(String[] args) {

        /*
           Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
                   Isminiz : John
                   Soyisminiz : Doe
                   Yasiniz : 44
                   Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim= scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz: ");
        String soyIsim= scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz: ");
        int yas= scanner.nextInt();

        System.out.println("İsminiz: "+isim);
        System.out.println("Soyisminiz: "+soyIsim);
        System.out.println("Yaşınız: "+yas);
        System.out.println("Kaydınız başarıyla tamamlanmıştır.");


    }
}
