package T120_Nested_if_Statements;

import java.util.Scanner;

public class SOru_4_gun_CalismaZamani {
    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
                “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
                girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        String girilenGun= scanner.next();

        if (girilenGun.equalsIgnoreCase("Cumartesi")||girilenGun.equalsIgnoreCase("Pazar")){
            System.out.println("Şimdi dinlenme zamanı");
        }else if (girilenGun.equalsIgnoreCase("Pazartesi")){
            System.out.println("Şimdi çalışma zamanı tatile 5 gün var");
        }else if (girilenGun.equalsIgnoreCase("Salı")){
            System.out.println("Şimdi çalışma zamanı tatile 4 gün var");
        }else if (girilenGun.equalsIgnoreCase("Çarşamba")){
            System.out.println("Şimdi çalışma zamanı tatile 3 gün var");
        }else if (girilenGun.equalsIgnoreCase("Perşembe")){
            System.out.println("Şimdi çalışma zamanı tatile 2 gün var");
        }else if (girilenGun.equalsIgnoreCase("Cuma")){
            System.out.println("Şimdi çalışma zamanı tatile 1 gün var");
        }
    }
}
