package T120_Nested_if_Statements;

import java.util.Scanner;

public class Soru_1_emeklilik {
    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
            Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
            “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen cinsiyet giriniz: \nErkek: 'E', Kadın: 'K' ");
        char cinsiyet= scanner.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yaşınızı giriniz: ");

        int yas= scanner.nextInt();

        if (cinsiyet=='E'){
            if (yas>=65){
                System.out.println("Emekli olabilirsi.");
            }else {
                System.out.println("Emekli olmak için "+(65-yas)+" yil daha çalışman gerekir");
            }
        } else if (cinsiyet=='K') {
            if (yas>=60){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olabilmek için "+(60-yas)+" yıl daha çalışman gerekir");
            }
        }

        }
    }
