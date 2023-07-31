package T120_if_Else_Statements;

import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir yıl giriniz");
        int yil= scanner.nextInt();

        if (yil%4==0 && yil%100==0){
            System.out.println("Girdiğiniz "+yil+" yilı artık yıldır");
        }else {
            System.out.println("Girdiğiniz "+yil+" yili artık yil değildir");
        }
    }
}
