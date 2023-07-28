package T120_DERS_03;

import java.util.Scanner;

public class C06_CemberHesaplama {
    public static void main(String[] args) {

        // Kullanıcıdan bir çemberin yarıçapını alıp,
        // çevresini ve alanını hesaplayın

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen çemberin yariçapini giriniz");

        double yariCap= scanner.nextDouble();

        double cemberCevre= 2*3.14*yariCap;
        double cemberAlan= 3.14*yariCap*yariCap;

        System.out.println("Çember çevresi: "+cemberCevre);
        System.out.println("Çember alanİ: "+ cemberAlan);

    }
}
