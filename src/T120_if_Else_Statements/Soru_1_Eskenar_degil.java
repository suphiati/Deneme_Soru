package T120_if_Else_Statements;

import java.util.Scanner;

public class Soru_1_Eskenar_degil {
    public static void main(String[] args) {

        /*
           Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
                   “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
         */


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen üçgenin ilk kenar uzunluğunu giriniz");
        double kenar1= scanner.nextDouble();

        System.out.println("Lütfen üçgenin ikinci kenar uzunluğunu giriniz");
        double kenar2= scanner.nextDouble();

        System.out.println("Lütfen üçgenin üçüncü kenar uzunluğunu giriniz");
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2== kenar3 && kenar1>0) {
            System.out.println("Eşkenar üçgen");
        }else {
            System.out.println("Eşkenar değil");
        }
    }
}
