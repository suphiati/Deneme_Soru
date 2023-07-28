package T120_DERS_04;

import java.util.Scanner;

public class C01_indtDeger_doubleolarakAlma {
    public static void main(String[] args) {

        // int olarak verilen 3 değerin ortalamasını double olarak yazdırın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen 3 tan tamsayi giriniz");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();
        double ortSayi= (sayi1+sayi2+sayi3)/3;
        System.out.println("3 sayinin ortalaması: " + ortSayi);
    }
}
