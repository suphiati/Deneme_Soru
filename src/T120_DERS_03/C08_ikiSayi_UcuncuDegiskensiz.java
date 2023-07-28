package T120_DERS_03;

import java.util.Scanner;

public class C08_ikiSayi_UcuncuDegiskensiz {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen 2 sayi giriniz");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();

        System.out.println("Birinci sayi değişmeden önce: "+ sayi1
                +"\nİkinci sayi değişmeden önce: " + sayi2);

        sayi1= sayi1+sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;

        System.out.println("   ");
        System.out.println("Birinci sayi değişimden sonra: "+ sayi1
                + "\nİkinci sayi değişimden sonra: " + sayi2);
    }
}
