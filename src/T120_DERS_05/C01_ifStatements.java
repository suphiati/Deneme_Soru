package T120_DERS_05;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("5 ile bölünebilirlik kontrolü için lütfen bir tamsayı giriniz");
        int sayi= scanner.nextInt();

        if (sayi%5==0){
            System.out.println("Sayi 5'in tam katı");
        }
    }
}
