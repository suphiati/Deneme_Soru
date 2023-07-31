package T120_Switch_Statements;

import java.util.Scanner;

public class Soru_2_ikincicozum {
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
                            case 1 -> System.out.print("On");
                            case 2 -> System.out.print("Yirmi");
                            case 3 -> System.out.print("Otuz");
                            case 4 -> System.out.print("Kırk");
                            case 5 -> System.out.print("Elli");
                            case 6 -> System.out.print("Altmış");
                            case 7 -> System.out.print("Yetmiş");
                            case 8 -> System.out.print("Seksen");
                            case 9 -> System.out.print("Doksan");
                        }

                        switch (birlerBasamagi) {
                            case 1 -> System.out.println("bir");
                            case 2 -> System.out.println("iki");
                            case 3 -> System.out.println("üç");
                            case 4 -> System.out.println("dört");
                            case 5 -> System.out.println("beş");
                            case 6 -> System.out.println("altı");
                            case 7 -> System.out.println("yedi");
                            case 8 -> System.out.println("sekiz");
                            case 9 -> System.out.println("dokuz");
                        }


                    }

                }


            }
        }




