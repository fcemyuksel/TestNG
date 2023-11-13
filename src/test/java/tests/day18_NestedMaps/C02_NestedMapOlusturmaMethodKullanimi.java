package tests.day18_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMapOlusturmaMethodKullanimi {
    public static void main(String[] args) {

        Map<Integer,Map<String ,String >> okulMapi=new HashMap<>();

        okulMapi=ogrenciEkle(okulMapi,101,"Ayse","Mercan","10","L","MF");
        //{101={sinif=10, sube=L, soyisim=Mercan, bolum=MF, isim=Ayse}}

        okulMapi=ogrenciEkle(okulMapi,102,"Cem","Yuksel","12","A","MF");
        //102={sinif=12, sube=A, soyisim=Yuksel, bolum=MF, isim=Cem}}

        okulMapi=ogrenciEkle(okulMapi,103,"Cenk","Yuksel","11","B","EA");
        //103={sinif=11, sube=B, soyisim=Yuksel, bolum=EA, isim=Cenk}}

        System.out.println(okulMapi);

        //103 numarali ogrencinin bolumunu yazdirin
        System.out.println(okulMapi.get(103).get("bolum")); //EA


    }

    public static Map<Integer, Map<String, String>> ogrenciEkle(Map<Integer, Map<String, String>> okulMapi,
                  Integer ogrenciNo,String isim, String soyisim, String sinif, String sube, String bolum) {

        Map<String ,String > eklenecekOgrenciMapi=new HashMap<>();
        eklenecekOgrenciMapi.put("isim",isim);
        eklenecekOgrenciMapi.put("soyisim",soyisim);
        eklenecekOgrenciMapi.put("sinif",sinif);
        eklenecekOgrenciMapi.put("sube",sube);
        eklenecekOgrenciMapi.put("bolum",bolum);

        okulMapi.put(ogrenciNo,eklenecekOgrenciMapi);
        return okulMapi;

    }


}
