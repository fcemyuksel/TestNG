package tests.day17_Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_OgrenciMap {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-K-MF");
        ogrenciMap.put(102,"Veli-Cem-12-L-TM");

        System.out.println(ogrenciMap);//{101=Ali-Can-11-K-MF, 102=Veli-Cem-12-L-TM}

        //101 numarali ogrencinin bilgilerini yazdirin
        System.out.println(ogrenciMap.get(101));//Ali-Can-11-K-MF

        System.out.println(ogrenciMap.get(103));//null
        System.out.println(ogrenciMap.getOrDefault(102, "ogrenci listede yok"));//Veli-Cem-12-L-TM
        System.out.println(ogrenciMap.getOrDefault(105, "ogrenci listede yok"));//ogrenci listede yok

        //Tum ogrencilerin numaralarini yazdirin

        System.out.println(ogrenciMap.keySet());//[101, 102]

        //tum ogrencilerin bilgilerini yazdirin
        System.out.println(ogrenciMap.values());//[Ali-Can-11-K-MF, Veli-Cem-12-L-TM]

        //102 numarali ogrencinin soyismini yazdirin
        String istenenOgrenci102Value=ogrenciMap.get(102);//Veli-Cem-12-L-TM
        String [] valueArr=istenenOgrenci102Value.split("-"); //[Veli, Cem, 12, L, TM]
        System.out.println("102 numarali ogrencinin soyismi: "+valueArr[1]);//102 numarali ogrencinin soyismi: Cem

        //101 numarali ogrencinin sinif ve subesini yazdirin

        String istenenOgrenci101Value=ogrenciMap.get(101);// Ali-Can-11-K-MF
        valueArr=istenenOgrenci101Value.split("-");// [Ali, Can, 11, K, MF]
        System.out.println("101 numarali ogrencinin sinif ve subesi: "+valueArr[2]+" / "+valueArr[3]);
        //101 numarali ogrencinin sinif ve subesi: 11 / K



    }
}
