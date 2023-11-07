package tests.day16_iterator_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C09_Set {
    public static void main(String[] args) {

        Set<Integer> sayilar=new TreeSet<>();
        //Set<Integer> sayilar=new HashSet<>();
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add(12);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(10);

        System.out.println(sayilar);//[1, 3, 5, 10, 12]

        //bu sette kac tane tek sayi var
        // Set index yapisini desteklemez, onun icin tek alternatif foreach loop'dur.

        int sayac=0;

        for (Integer each:sayilar
             ) {
            if (each%2!=0){
                sayac++;
            }
        }
        System.out.println(sayac);//3
    }
}
