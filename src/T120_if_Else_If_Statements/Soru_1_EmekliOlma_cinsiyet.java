package T120_if_Else_If_Statements;

import java.util.Scanner;

public class Soru_1_EmekliOlma_cinsiyet {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet=='E' && yas>=65){
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet=='E' && yas<65) {
            System.out.println("Erkek emekli olmaz, " + (65-yas) + " yıl daha çalışmalısınız");

        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("Kadın emekli olabilir");
        } else if (cinsiyet =='K' && yas<60) {
            System.out.println("Kadın emekli olmaz, " + (60-yas)+ " yıl daha çalışmalısınız");
        }

    }
}
