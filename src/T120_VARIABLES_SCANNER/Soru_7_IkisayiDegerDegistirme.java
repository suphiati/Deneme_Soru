package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_7_IkisayiDegerDegistirme {
    public static void main(String[] args) {

        // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen 2 pozitif tam sayi giriniz");
        System.out.print("Değiştirilmeden önceki sayi1 değeri: ");
        int sayi1= scanner.nextInt();
        System.out.print("Değiştirilmeden önceki sayi2 değeri: ");
        int sayi2= scanner.nextInt();

        int temp= sayi1;
        sayi1= sayi2;
        sayi2= temp;

        System.out.println("Değiştirilmiş değerler; "+"İlk tam sayi değeri: "+sayi1+", "+"İkinci tam sayi değeri: "+sayi2);




    }
}
