package Team7_pratice;

public class C03 {

    public static void main(String[] args) {

        // - Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        //kullanildigini yazdiran bir method olusturun.


        int [] arr={5,3,7,8,9,2,8,6,7,5,};
        int arananSayi=4;

        elemanVarolupOlmadigiKontrol(arr, arananSayi);


    }

    public static void elemanVarolupOlmadigiKontrol(int[] arr, int arananSayi){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }

        }if (sayac==0){
            System.out.println("Girilen sayı listede bulunmamaktadır");
        }else {
            System.out.println("Arnan sayi "+arananSayi+" sayisi array'de "+ sayac+" kere yazılmıştır");
        }


    }
}
