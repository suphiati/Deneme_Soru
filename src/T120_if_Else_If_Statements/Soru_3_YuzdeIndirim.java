package T120_if_Else_If_Statements;

import java.util.Scanner;

public class Soru_3_YuzdeIndirim {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun.
                Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
                Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen alacağınız ürün adedini giriniz");
        double urunAdedi = scanner.nextDouble();
        System.out.println("Lütfen ürünün fiyatını giriniz");
        double urunFiyati = scanner.nextDouble();
        System.out.print("Müşteri kartı var mı?  ");
        System.out.println("E: Evet, H: Hayır");
        char musteriKartiVarMi = scanner.next().toUpperCase().charAt(0);

        if (musteriKartiVarMi == 'E') {
            if (urunAdedi > 10) {
                System.out.println("%20 İndirimli ürün fiyati: " + urunAdedi * urunFiyati * 0.8);
            } else {
                System.out.println("%15 İndirimli ürün fiyati: " + urunAdedi * urunFiyati * 0.85);
            }
        } else if (musteriKartiVarMi == 'H') {
            if (urunAdedi > 10) {
                System.out.println("%15 İndirimli ürün fiyati: " + urunAdedi * urunFiyati * 0.85);
            } else {
                System.out.println("%10 İndirimli ürün fiyati: " + urunAdedi * urunFiyati * 0.9);
            }

        }
    }
}
