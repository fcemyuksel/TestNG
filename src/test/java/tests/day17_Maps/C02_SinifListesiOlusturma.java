package tests.day17_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class C02_SinifListesiOlusturma {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = new TreeMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Veli-Han-10-H-MF");
        ogrenciMap.put(108,"Kemal-Cem-11-M-TM");
        ogrenciMap.put(109,"Ayse-Han-10-K-MF");

        // 10/K sinifindaki ogrencilerin isim ve soyisimlerini liste olarak yazdirin

        // Herbir ogrencinin bilgisini inceleyelim

        // sinif == 10 ve sube == K ise ogrencinin isim ve soyismini yazdiralim

        Collection<String > valueCollection =ogrenciMap.values();
        System.out.println(valueCollection);
        //[Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Veli-Han-10-H-MF, Kemal-Cem-11-M-TM, Ayse-Han-10-K-MF]

        for (String eachValue:valueCollection
             ) { //eachValue==> Ali-Can-11-H-MF
            String [] valueArr=eachValue.split("-");//Ali, Can, 11, H, MF

            if (valueArr[2].equals("10") && valueArr[3].equals("K")){
                System.out.println(valueArr[0]+" "+valueArr[1]);
                //Veli Cem
                //Sevgi Can
                //Ayse Han

            }
        }

    }

    public static void sinifSubeListesiYazdirma(Map<Integer,String > ogrenciMap,String sinif, String sube){

        //ogrenci Mapindeki tum value'lari bir colection olarak kaydedelim
        Collection<String > valueCollection =ogrenciMap.values();

        //bir for each loop ile  kaydettigimiz valueCollection'daki value'leri ele alalim
        for (String eachValue:valueCollection
             ) {
            //valu'lar String olarak birden fazla bilgiyi tutuyorlar
            //bilgilere ulasabilmek icin, value'yu split("-") methodu ile arraye cevirelim

            String [] valueArr=eachValue.split("-");//[Ali, Can, 11, H, MF]

            // artik array icerisinde tum istedigimiz bilgilere ulasabilriiz
            //bizden istenen verilen sinif ve subedeki ogrencileri listelememiz

            if (valueArr[2].equals(sinif) && valueArr[3].equalsIgnoreCase(sube))
                System.out.println(valueArr[0]+" "+valueArr[1]);

        }
    }
}
