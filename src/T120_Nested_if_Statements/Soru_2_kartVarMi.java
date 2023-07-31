package T120_Nested_if_Statements;

import java.util.Scanner;

public class Soru_2_kartVarMi {
    public static void main(String[] args) {

        /*
          Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
          kullaniciya musteri karti olup olmadigini sorun.
          Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
          Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
         */


        Scanner scanner= new Scanner(System.in);
        System.out.println("Kaç adet ürün alacaksınız?");
        int urunAdedi= scanner.nextInt();
        System.out.println("Ürün fiyatı ne kadardı?");
        double urunFiyati= scanner.nextDouble();
        System.out.print("Müşteri kartı var mı?");
        System.out.println("Evet : E, Hayır: H");
        String musteriKartiVarmi= scanner.next();



        if (musteriKartiVarmi.equalsIgnoreCase("E")){
            if (urunAdedi>10){
                System.out.println("İndirim miktari: "+urunFiyati*urunAdedi*0.2);
                System.out.println("İndirimli ürün fiyatı: "+urunFiyati*urunAdedi*0.8);
            } else if (urunAdedi<=10) {
                System.out.println("İndirim miktari: "+urunFiyati*urunAdedi*0.15);
                System.out.println("İndirimli ürün fiyatı: "+urunFiyati*urunAdedi*0.85);

            }
        } else if ((musteriKartiVarmi.equalsIgnoreCase("H"))) {
            if (urunAdedi>10){
                System.out.println("İndirim miktari: "+urunFiyati*urunAdedi*0.15);
                System.out.println("İndirimli ürün fiyatı: "+urunFiyati*urunAdedi*0.85);
            } else if (urunAdedi<=10) {
                System.out.println("İndirim miktari: "+urunFiyati*urunAdedi*0.1);
                System.out.println("İndirimli ürün fiyatı: "+urunFiyati*urunAdedi*0.9);

            }

        }
    }
}
