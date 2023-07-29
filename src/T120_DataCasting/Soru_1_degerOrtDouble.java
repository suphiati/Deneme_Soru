package T120_DataCasting;

import java.util.Scanner;

public class Soru_1_degerOrtDouble {
    public static void main(String[] args) {

        /*
        Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
                yazin
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen sirasiyla 3 tane tam sayı giriniz");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();

        double sayiOrt= (sayi1+sayi2+sayi3)/3;
        System.out.println("Üç sayinin ondalıklı olarak ortalaması: "+sayiOrt);
    }
}
