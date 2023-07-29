package T120_DataCasting;

import java.util.Scanner;

public class Soru_2_harfAl_sonraki3harfiYazdir {
    public static void main(String[] args) {

        /*
            Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf= scanner.next().charAt(0);

        System.out.println("Girilen harf: "+girilenHarf);
        System.out.println("Girilen harften sonraki 3 harf sırasıyla: "+(char)(girilenHarf+1)+", "+(char)(girilenHarf+2)+", "+(char)(girilenHarf+3));
    }
}
