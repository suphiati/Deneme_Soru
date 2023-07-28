package T120_DERS_05;

import java.util.Scanner;

public class C04_Eskenar_Ucgen {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen üçgen kenar uzunlukları giriniz");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eşkenar Üçgen");
        }
    }
}
