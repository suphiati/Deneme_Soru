package T120_if_Else_Statements;

import java.util.Scanner;

public class Soru_4_Karakter_buyukMu {
    public static void main(String[] args) {

        /*
           Soru 4- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
                   olup olmadigini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kontol için lütfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Girilen " + karakter + " karakteri büyük harftir");
        } else {
            System.out.println("Girilen karakter büyük harf değildir");
        }
    }
}
