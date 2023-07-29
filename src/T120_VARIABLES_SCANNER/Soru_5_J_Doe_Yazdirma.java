package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_5_J_Doe_Yazdirma {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
                girilen bilgiler : J Doe, 44
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz:");
        String isim= scanner.nextLine();
        System.out.println("lÜtfen soyisminizi giriniz:");
        String soyIsim= scanner.nextLine();
        System.out.println("Lütfen yaşınızı giriniz:");
        int yas= scanner.nextInt();

        isim= isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        soyIsim= soyIsim.toUpperCase().charAt(0)+soyIsim.substring(1).toLowerCase();

        System.out.println("Girilen bilgiler: "+isim+" "+soyIsim+", "+yas);
    }
}
