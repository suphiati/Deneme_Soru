package T120_DERS_05;

import java.util.Scanner;

public class C06_EmekliOlma {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scanner.nextInt();


        if (yas>=65){
            System.out.println("Emekli olabilirsin");
        }else {
            System.out.println("Emekli olmak için : "+(65-yas)+" yıl daha çalışmalısınız");
        }
    }
}
