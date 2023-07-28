package Slackten_Deneme_Sorulari;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Soru 3-)   SCANNER
        //Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ortalamasını almak istediğiniz 5 sayıyı giriniz");

        System.out.print("Lütfen birinci sayiyi giriniz: ");
        double sayi1= scanner.nextDouble();
        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        double sayi2= scanner.nextDouble();
        System.out.print("Lütfen üçüncü sayiyi giriniz: ");
        double sayi3= scanner.nextDouble();
        System.out.print("Lütfen dördüncü sayiyi giriniz: ");
        double sayi4= scanner.nextDouble();
        System.out.print("Lütfen besinci sayiyi giriniz: ");
        double sayi5= scanner.nextDouble();

        System.out.println("Sayiların ortalaması: "+(sayi1+sayi2+sayi3+sayi4+sayi5)/5);
    }
}
