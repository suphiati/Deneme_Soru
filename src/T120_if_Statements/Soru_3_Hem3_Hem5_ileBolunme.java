package T120_if_Statements;

import java.util.Scanner;

public class Soru_3_Hem3_Hem5_ileBolunme {
    public static void main(String[] args) {

        /*
           Soru 3- Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa
           ”Uc ile bolunebilen sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayi giriniz");

        int sayi= scanner.nextInt();

        if (sayi%3==0) System.out.println("Üç ile bölünebilen sayi");
        if (sayi%5==0) System.out.println("Beş ile bölünebilen sayi");
    }
}
