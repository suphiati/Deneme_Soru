package T120_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C04_Array_List {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        System.out.println(); // []
        isimler.add("Ali");
        isimler.add("Veli");
        System.out.println(isimler); // [Ali, Veli]


        List<String> isimler1= new ArrayList<>();

        isimler1.add("Ayşe");
        isimler1.add("Fatma");
        List<String> isimler2= new ArrayList<>();

        isimler2.add("Mehmet");
        isimler2.add("Ahmet");

        isimler1.addAll(isimler2);
        System.out.println(isimler1); // [Ayşe, Fatma, Mehmet, Ahmet]






    }
}
