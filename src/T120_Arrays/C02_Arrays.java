package T120_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int[] arr={3,4,5,6};

        int [] yeniArr=new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]= arr[i];
            System.out.println(Arrays.toString(yeniArr));

            /*
               [3, 0, 0, 0, 0]
               [3, 4, 0, 0, 0]
               [3, 4, 5, 0, 0]
               [3, 4, 5, 6, 0]
             */

        }
        yeniArr[yeniArr.length-1]=7;
        System.out.println(Arrays.toString(yeniArr)); // [3, 4, 5, 6, 7]

        arr= yeniArr;
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]
    }
}
