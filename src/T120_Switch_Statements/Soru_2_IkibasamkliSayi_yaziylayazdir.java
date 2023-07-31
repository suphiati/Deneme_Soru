package T120_Switch_Statements;

import java.util.Scanner;

public class Soru_2_IkibasamkliSayi_yaziylayazdir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 basamaklı bir sayi giriniz");
        int sayi= scanner.nextInt();
        int birlerBasamagi= sayi%10;
        int onlarBasamagi= sayi/10;

        if (sayi<10 ||sayi>99 ){
            System.out.println("Yanlış giriş yaptınız. Lütfen 2 basamaklı bir sayi giriniz");
        }else {
            if (onlarBasamagi>=1 && onlarBasamagi<=9) {
                switch (onlarBasamagi) {
                    case 1:
                        System.out.print("On");
                        break;
                    case 2:
                        System.out.print("Yirmi");
                        break;
                    case 3:
                        System.out.print("Otuz");
                        break;
                    case 4:
                        System.out.print("Kırk");
                        break;
                    case 5:
                        System.out.print("Elli");
                        break;
                    case 6:
                        System.out.print("Altmış");
                        break;
                    case 7:
                        System.out.print("Yetmiş");
                        break;
                    case 8:
                        System.out.print("Seksen");
                        break;
                    case 9:
                        System.out.print("Doksan");
                        break;


                }

                    switch (birlerBasamagi) {
                        case 1:
                            System.out.println("bir");
                            break;
                        case 2:
                            System.out.println("iki");
                            break;
                        case 3:
                            System.out.println("üç");
                            break;
                        case 4:
                            System.out.println("dört");
                            break;
                        case 5:
                            System.out.println("beş");
                            break;
                        case 6:
                            System.out.println("altı");
                            break;
                        case 7:
                            System.out.println("yedi");
                            break;
                        case 8:
                            System.out.println("sekiz");
                            break;
                        case 9:
                            System.out.println("dokuz");
                            break;
                    }


            }

        }


    }
}


