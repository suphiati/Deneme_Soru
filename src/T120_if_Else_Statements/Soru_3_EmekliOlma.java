package T120_if_Else_Statements;

import java.util.Scanner;

public class Soru_3_EmekliOlma {
    public static void main(String[] args) {

        /*
          Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
                  yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        if (yas >= 65) {
            System.out.println("Emekli olabilrsiniz");
        } else {
            System.out.println("Emekli olabilmek için " + (65 - yas) + " yil daha çalışmanız gerekmektedir");
        }
    }
}
