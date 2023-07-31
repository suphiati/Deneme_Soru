package T120_Switch_Statements;

import java.util.Scanner;

public class Soru_1_rakam_yaziylayazdir {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam= scanner.nextInt();

        switch (rakam){
            case 1:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Bir");
                break;
            case 2:
                System.out.println("Girilen rakam: "+rakam+", yazıyla İki");
                break;
            case 3:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Üç");
                break;
            case 4:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Dört");
                break;
            case 5:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Beş");
                break;
            case 6:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Altı");
                break;
            case 7:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Yedi");
                break;
            case 8:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Sekiz");
                break;
            case 9:
                System.out.println("Girilen rakam: "+rakam+", yazıyla Dokuz");
                break;
            default:
                System.out.println("Girilen rakam 1 ila 9 arasında olmalıdır");
        }
    }
}

