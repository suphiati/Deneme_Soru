package T120_DERS_03;

import java.util.Scanner;

public class C04_IsimalipYazdirma {
    public static void main(String[] args) {

        /* Kullanıcıdan ismini, soyismini ve yaşını alıp yazdırın

          isim:
          soyisim:
          yas:

          Kaydınız başarılı

         */

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim= scanner.nextLine();


        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim= scanner.nextLine();


        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scanner.nextInt();

        System.out.println("İsim: "+isim);
        System.out.println("Soyisim: "+soyIsim);
        System.out.println("Yas: "+yas);

        System.out.println("    ");
        System.out.println("Kaydınız başarıyla oluşturulmuştur");
    }
}
