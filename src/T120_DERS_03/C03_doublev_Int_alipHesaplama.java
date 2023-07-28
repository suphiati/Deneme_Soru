package T120_DERS_03;

import java.util.Scanner;

public class C03_doublev_Int_alipHesaplama {
    public static void main(String[] args) {

        // Kullanıcıdan bir double, bir de int sayi alip,
        // bunların toplamını ve çarpımını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen double bir değer girin");
        double db= scanner.nextDouble();

        System.out.println("Lütfen int bir değer girin");
        int sayi= scanner.nextInt();

        double doubleToplam= db+sayi;
        int intToplam= (int )db+sayi;

        System.out.println("Sayilar double olarak toplami: " + doubleToplam);
        System.out.println("Sayilar int olarak toplami: " + intToplam);

        double doubleCarpim= db*sayi;
        int intCarpim= (int) db*sayi;

        System.out.println("Sayilar double olarak çarpimi: " + doubleCarpim);
        System.out.println("Sayilar int olarak çarpimi: " + intCarpim);





    }
}
