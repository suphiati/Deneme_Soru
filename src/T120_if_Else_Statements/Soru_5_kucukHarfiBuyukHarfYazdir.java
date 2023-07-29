package T120_if_Else_Statements;

import java.util.Scanner;

public class Soru_5_kucukHarfiBuyukHarfYazdir {
    public static void main(String[] args) {

        /*
          Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
                  olarak yazdirin, yoksa girilen harfi yazdirin
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Kontrol için lütfen bir karakter giriniz");
        char karakter= scanner.next().charAt(0);

        if (karakter>='a' && karakter<= 'z'){
            System.out.println("Girilen karakter değiştirilmiş hali: "+Character.toUpperCase(karakter));
        }else {
            System.out.println("Girilen karakter: "+karakter);
        }

    }
}
