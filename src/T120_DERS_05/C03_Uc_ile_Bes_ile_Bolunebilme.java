package T120_DERS_05;

import java.util.Scanner;

public class C03_Uc_ile_Bes_ile_Bolunebilme {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scanner.nextInt();

        if (sayi%3==0){
            System.out.println("Üç ile bölünebilen sayi");
        }
        if (sayi%5==0){
            System.out.println("Beş ile bölünebilen sayi");
        }
    }

}
