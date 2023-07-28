package T120_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Arrayden_ArrayList_Yapma {
    public static void main(String[] args) {

        int[] arr={1,5,3,6,8,9,7,4,8};

        List<Integer> sayilar= new ArrayList<>();

        for (Integer each:arr
             ) {
            sayilar.add(each);
            
        }
        System.out.println(sayilar); // [1, 5, 3, 6, 8, 9, 7, 4, 8]


        String[] strArr={"a","b","c"};
        List<String> harfler= Arrays.asList(strArr);
        System.out.println(harfler); // [a, b, c]

    }
}
