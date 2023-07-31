package T120_Ternary_Operator;

import java.util.Scanner;

public class Butun_Sorular {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi= scanner.nextInt();

        System.out.println(girilenSayi%5==0 ? "Sayi 5'in tam kati" : "Girilen sayi 5'in katı değil");


        System.out.println(" ---------- ");
        System.out.println();

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu da giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();
        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "Eşkenar Üçgen" : "Eşkenar değil");

        System.out.println(" ---------- ");
        System.out.println();

        //Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin
        System.out.println("Lütfen bir harf giriniz");

        char girilenHarf= scanner.next().charAt(0);
        System.out.println(girilenHarf>='A' && girilenHarf<='Z' ? "Girilen harf: "+girilenHarf : "Girilen harfin değiştirilmiş hali: "+Character.toUpperCase(girilenHarf));


        System.out.println(" ---------- ");
        System.out.println();

        //Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.
        System.out.println("Lütfen notunuzu giriniz");
        int girilenNot= scanner.nextInt();
        System.out.println(girilenNot>= 50 ? "Sınıfı Geçtiniz" : "Maalesef Kaldınız");

        System.out.println(" ---------- ");
        System.out.println();

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        System.out.println("Lütfen 2 sayi yazın");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();
        System.out.println(sayi1>sayi2 ? "Büyük olmayan sayi :"+sayi2 : "Büyük olmayan sayi :"+sayi1);



        System.out.println(" ---------- ");
        System.out.println();

        //Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scanner.nextInt();

        System.out.println(sayi>0? "Girilen "+sayi+" sayisinin mutlak değeri " +sayi+" dir" : "Girilen "+sayi+" sayisinin mutlak değeri " +(-sayi)+" dir");


    }
}
