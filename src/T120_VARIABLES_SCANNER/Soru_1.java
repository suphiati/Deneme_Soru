package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_1 {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        // girilen degerleri aciklamalariyla yazdirin.

        Scanner scanner= new Scanner(System.in);


        System.out.println("Lütfen bir tamsayı giriniz: ");
        int tamsayi= scanner.nextInt();

        System.out.println("Lütfen bir metin değeri giriniz: ");
        String kelime= scanner.next();

        System.out.println("Lütfen bir karakter değeri giriniz: ");
        char karkter=scanner.next().charAt(0);

        System.out.println("Girilen "+tamsayi+ " değeri bir int değerdir.");
        System.out.println("Girilen "+kelime+ " değeri bir String değerdir.");
        System.out.println("Girilen "+karkter+ " değeri bir char değerdir.");


    }
}
