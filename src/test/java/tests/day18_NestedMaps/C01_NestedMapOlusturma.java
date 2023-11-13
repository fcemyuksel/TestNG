package tests.day18_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMapOlusturma {
    public static void main(String[] args) {

        Map<String ,String > ogrenciMap101=new HashMap<>();
        ogrenciMap101.put("isim","Ali");
        ogrenciMap101.put("soyisim","Can");
        ogrenciMap101.put("sinif","11");
        ogrenciMap101.put("sube","H");
        ogrenciMap101.put("bolum","MF");

        Map<String ,String > ogrenciMap102=new HashMap<>();
        ogrenciMap102.put("isim","Veli");
        ogrenciMap102.put("soyisim","Cem");
        ogrenciMap102.put("sinif","10");
        ogrenciMap102.put("sube","K");
        ogrenciMap102.put("bolum","TM");

        Map<String ,String > ogrenciMap103=new HashMap<>();
        ogrenciMap103.put("isim","Ali");
        ogrenciMap103.put("soyisim","Cem");
        ogrenciMap103.put("sinif","11");
        ogrenciMap103.put("sube","K");
        ogrenciMap103.put("bolum","TM");

        Map<Integer,Map<String ,String >>ogrenciMapi=new HashMap<>();

        ogrenciMapi.put(101,ogrenciMap101);
        ogrenciMapi.put(102,ogrenciMap102);
        ogrenciMapi.put(103,ogrenciMap103);

        System.out.println(ogrenciMapi);

        /*
        {101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
        102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
        103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}}

         */

        //102 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenciMapi.get(102).get("soyisim")); //Cem

        //103 numarali ogrencinin sinifini yazdirin

        System.out.println(ogrenciMapi.get(103).get("sinif")); //11

        //101 numarali ogrencinin soysimini "Mutlu yapin

        ogrenciMapi.get(101).put("soyisim","Mutlu");
        System.out.println(ogrenciMapi.get(101)); //{sinif=11, sube=H, soyisim=Mutlu, bolum=MF, isim=Ali}

        //103 numarali ogrencinin sinifini 12 yapin
        ogrenciMapi.get(103).put("sinif","12");
        System.out.println(ogrenciMapi.get(103)); //{sinif=12, sube=K, soyisim=Cem, bolum=TM, isim=Ali}


    }
}
