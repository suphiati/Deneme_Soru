package T120_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Array_List {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        // List<int> intsayi= new ArrayList<>();
        // List<double> dbsayi= new ArrayList<>();

        /*
         <> içine sadece Class yazılması kabul edebilir. Prinmitive data türlerini kabul etmez.
         */
        List<Integer> intsayi= new ArrayList<>(); // kabul eder
        List<Double> dbsayi= new ArrayList<>(); // kabul eder

        isimler.add("Suphi");
        isimler.add("Veli Can");
        /* isimler.add(5);
         isimler.add(true);
          String istediği için bunları kabul etmiyor.
         */

        // Fakat List<Object> isimler= new ArraysList<>();
        // yapsak bu sefer boolean ve int değerleri de kabul eder. Çünkü Object hepsini kapsamış oluyor

      /*
        List<Objects> isimler= new ArrayList<>();
         isimler.add("Suphi");
         isimler.add("Veli Can");
         isimler.add(5);
         isimler.add(true);

         Bu şekilde hespini kabul eder.(Yukarıda Obeject yazarsak kabul ediyor. Yeni yamaya çalışınca hata veriyor)

         */



    }
}
