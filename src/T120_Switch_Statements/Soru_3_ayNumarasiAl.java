package T120_Switch_Statements;

import java.util.Scanner;

public class Soru_3_ayNumarasiAl {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen 1-12 arası bir numara giriniz");
        int ayNo= scanner.nextInt();


            switch(ayNo) {
                case 1:
                    System.out.println("Ocak");
                    break;
                case 2:
                    System.out.println("Şubat");
                    break;
                case 3:
                    System.out.println("Mart");
                    break;
                case 4:
                    System.out.println("Nisan");
                    break;
                case 5:
                    System.out.println("Mayıs");
                    break;
                case 6:
                    System.out.println("Haziran");
                    break;
                case 7:
                    System.out.println("Temmuz");
                    break;
                case 8:
                    System.out.println("Ağustos");
                    break;
                case 9:
                    System.out.println("Eylül");
                    break;
                case 10:
                    System.out.println("Ekim");
                    break;
                case 11:
                    System.out.println("Kasım");
                    break;
                case 12:
                    System.out.println("Aralık");
                    break;
                default:
                    System.out.println("Yanlış giriş yaptınız. Lütfen 1 ila 12 arası bir sayı giriniz");

                }
    }
}
