package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_8_UcuncuDegiskensiz_Swap {
    public static void main(String[] args) {

        /*
        Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
                           degerlerini degistirin(swap).
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 pozitif tam sayi giriniz");
        System.out.print("Değiştirilmeden önceki sayi1 değeri: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Değiştirilmeden önceki sayi2 değeri: ");
        int sayi2 = scanner.nextInt();

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        /*
        sayi1 = sayi1 - sayi2;
        sayi2 = sayi1 + sayi2;
        sayi1 = sayi2 - sayi1;
         */

        System.out.println("Değiştirilmiş değerler; " + "İlk tam sayi değeri: " + sayi1 + ", " + "İkinci tam sayi değeri: " + sayi2);
    }
}
