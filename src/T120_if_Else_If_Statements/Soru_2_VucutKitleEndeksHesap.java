package T120_if_Else_If_Statements;

import java.util.Scanner;

public class Soru_2_VucutKitleEndeksHesap {
    public static void main(String[] args) {

        /*
           Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
                   hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse obez,
                   25-30 arasi ise kilolu,
                   20-25 arasi ise normal,
                   20’den kucukse zayif yazdirin.
         */


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz");
        double kilo= scanner.nextDouble();
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz");
        double boy= scanner.nextDouble();

        double vucutKitleEndeksi=(kilo*10000)/(boy*boy);

        if (vucutKitleEndeksi>=30){
            System.out.println("Vücut kitle endeksi: "+vucutKitleEndeksi+" ise Obez");
        } else if (vucutKitleEndeksi<30 && vucutKitleEndeksi>=25) {
            System.out.println("Vücut kitle endeksi: "+vucutKitleEndeksi+" ise Kilolu");
        } else if (vucutKitleEndeksi<25 && vucutKitleEndeksi>=20) {
            System.out.println("Vücut kitle endeksi: "+vucutKitleEndeksi+" ise Normal");

        }else {
            System.out.println("Vücut kitle endeksi: "+vucutKitleEndeksi+" ise Zayıf");
        }
    }
}
