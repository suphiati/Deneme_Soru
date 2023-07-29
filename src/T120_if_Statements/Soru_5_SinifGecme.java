package T120_if_Statements;

import java.util.Scanner;

public class Soru_5_SinifGecme {
    public static void main(String[] args) {

        /*
           Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
                   kucukse “Maalesef kaldin” yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scanner.nextDouble();

        if (not>=50) System.out.println("Sınıfı Geçtin");
        if (not<50) System.out.println("Maalesef kaldın");
    }
}
