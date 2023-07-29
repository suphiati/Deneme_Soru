package T120_if_Else_Statements;

import java.util.Scanner;

public class Soru_2_Sinif_Gectin_Kaldin {
    public static void main(String[] args) {

        /*
           Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
                   kucukse “Maalesef kaldin” yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not= scanner.nextDouble();

        if (not>=50) {
            System.out.println("Sınıfı Geçtin");
        }else {
            System.out.println("Maalesef kaldın");
        }
    }
}
