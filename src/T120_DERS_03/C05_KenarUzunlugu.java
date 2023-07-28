package T120_DERS_03;

import java.util.Scanner;

public class C05_KenarUzunlugu {
    public static void main(String[] args) {

        // Kullanıcıdan bir dikdörtgenini 2 kenar uzunlğunu alın,
        // dikdörtgenin çevresini ve alanını hesaplayın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin kenar uzunluklarını giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();

        System.out.println("Dikdörtgen çevre: " + (kenar2+kenar1));
        System.out.println("Dikdörtgen Alanı: " + (kenar2*kenar1));


    }
}
