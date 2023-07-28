package T120_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] sayilar= new int[6];

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]

        String[] isim= new String[6];
        System.out.println(Arrays.toString(isim)); // [null, null, null, null, null, null]

        boolean[] dogruMuYanlisMi= new boolean[6];
        System.out.println(Arrays.toString(dogruMuYanlisMi)); // [false, false, false, false, false, false]

        char[] karakter=new char[6];
        System.out.println(Arrays.toString(karakter)); // [ ,  ,  ,  ,  ,  ]

        String str="Java cok güzel";

        str.split(" ");
        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, cok, güzel]

        String[] kelimeler1= str.split("a");
        System.out.println(Arrays.toString(kelimeler1)); // [J, v,  cok güzel]

        String[] kelimeler2= str.split("cok");
        System.out.println(Arrays.toString(kelimeler2)); // [Java ,  güzel]

        String[] kelimeler3= str.split("");
        System.out.println(Arrays.toString(kelimeler3)); // [J, a, v, a,  , c, o, k,  , g, ü, z, e, l]
    }
}
