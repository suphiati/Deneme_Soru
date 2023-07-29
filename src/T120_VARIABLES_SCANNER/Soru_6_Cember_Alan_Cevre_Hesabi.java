package T120_VARIABLES_SCANNER;

import java.util.Scanner;

public class Soru_6_Cember_Alan_Cevre_Hesabi {
    public static void main(String[] args) {


        // Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Cemberin alani ve cevresini hesaplamak için bir yariçap giriniz");
        double yaricap= scanner.nextDouble();
        double cemberCevre= 2*3.14*yaricap;
        double cemberAlan= 3.14*yaricap*yaricap;

        System.out.println("Çemberin çevresi: "+cemberCevre);
        System.out.println("Çemberin alanı: "+cemberAlan);
    }
}
