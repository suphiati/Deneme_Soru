package T120_forLoop;

public class S01 {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan tamsayıları toplayın

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam); // 5050


        // verilen 2 sayının ilkinden başlayıp ikinciye kadar
        // 3'er 3'er yazdırın ( İkinci sayi şartları sağlamıyorsa yazdırılmayabilir)

        int bas=20;
        int bitis= 61;
        for (int i = bas; i <=bitis ; i+=3) {
            System.out.print(i+ " "); // 20 23 26 29 32 35 38 41 44 47 50 53 56 59

        }
        System.out.println();

        // verilen sayidan başlayarak geriye 1'e doğru
        // 3 ile bölünebilen sayıları yazdırın

        int input=100;
        for (int i = input; i >=1 ; i--) {
            if (i%3==0){
                System.out.print(i+ " "); // 99 96 93 90 87 84 81 78 75 72 69 66 63 60 57 54 51 48 45 42 39 36 33 30 27 24 21 18 15 12 9 6 3
            }

        }
    }
}
