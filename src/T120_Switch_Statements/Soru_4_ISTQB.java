package T120_Switch_Statements;

import java.util.Scanner;

public class Soru_4_ISTQB {
    public static void main(String[] args) {

        /*
           Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
                   ve girilen harfin karsiligini yazdirin.

                   I : International S : Software T : Testing Q : Qualifications B: Board
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen anlamını öğrenmek istediğiniz harfi giriniz");
        char harf= scanner.next().toUpperCase().charAt(0);


    }
}
