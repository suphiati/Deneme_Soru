package T120_DERS_03;

import java.util.Scanner;

public class C02_UcfarkliDegerYazdirma {
    public static void main(String[] args) {

        // Kullanıcıdan 3 farklı data türünde değer alıp,
        // girilen değerleri açıklamalarıyla yazdırın

        Scanner scanner = new Scanner(System.in);

        //İlk veri türü: Tam sayı (int)
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi1= scanner.nextInt();
        System.out.println("Sayi değeri int tam sayı: " + sayi1);

        // İkinci veri türü: Ondalıklı sayı (double)
        System.out.println("Lütfen ondalıklı bir sayi giriniz");
        double sayi2= scanner.nextDouble();
        System.out.println("Sayi değeri ondalıklı sayı: " + sayi2);

        // Üçüncü veri türü: Metin (String)
        scanner.nextLine(); // Önceki nextDouble veya nextInt çağrısından sonra kalan boşluğu temizle
        System.out.println("Lütfen bir metin giriniz");
        String metin= scanner.nextLine();
        System.out.println("Girilen değer metin : " + metin);

    }
}
