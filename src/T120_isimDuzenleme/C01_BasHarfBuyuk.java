package T120_isimDuzenleme;

public class C01_BasHarfBuyuk {
    public static void main(String[] args) {

        String isim= "SUPHI";
        String soyIsim="CELIKOZ";


        String isimDuzenlenmis= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyIsimDuzenlenmis= soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();

        System.out.println("İlk girilen: "+isim+" "+soyIsim); // İlk girilen: SUPHI CELIKOZ
        System.out.println("Düzenlenmiş hali: " +isimDuzenlenmis+" "+soyIsimDuzenlenmis); // Düzenlenmiş hali: Suphı Celıkoz
    }
}
