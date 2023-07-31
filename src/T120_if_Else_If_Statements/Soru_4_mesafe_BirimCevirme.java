package T120_if_Else_If_Statements;

import java.util.Scanner;

public class Soru_4_mesafe_BirimCevirme {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
                istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
                “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen km cinsinden mesafe giriniz");
        double mesafeKilometre= scanner.nextDouble();
        System.out.println("Çevirmek istediğiniz birim nedir?\nsantimetre: cm   metre: m");
        String birim= scanner.next();
        double mesafeMetre= mesafeKilometre*1000;
        double mesafeSantimetre= mesafeKilometre*100000;

        if (birim.equalsIgnoreCase("m")){
            System.out.println("Kilometre olarak girilen mesafe değerinin metre cinsinden karşılığı: "+mesafeMetre);

        } else if (birim.equalsIgnoreCase("cm")) {
            System.out.println("Kilometre olarak girilen mesafe değerinin santimetre cinsinden karşılığı: "+mesafeSantimetre);
        }else {
            System.out.println("İstediğiniz birim sisteme kayıtlı değil");
        }


    }
}
