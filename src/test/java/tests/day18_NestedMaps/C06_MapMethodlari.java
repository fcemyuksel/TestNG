package tests.day18_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_MapMethodlari {
    public static void main(String[] args) {
        /*

        Soru: Verilen bir arrayde kullanilan harfleri ve
        kacar defa kullanildigini yazdirin

            input: {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
            output: a kullanimi:3 adet      a=3
                    b kullanimi: 3 adet     b=3
                    c kullanimi: 3 adet     c=3
                    d kullanimi: 3 adet     d=3
                    e kullanimi: 2 adet     e=2
         */

        String[] harfler = {"a", "b", "c", "d", "e", "c", "d", "b", "e", "a", "c", "b", "d", "a" };

        //1. yontem for loop ve if else ile yapalim

        Map<String, Integer> kullanimSayilariMap = new HashMap<>();

        for (int i = 0; i < harfler.length; i++) {
            if (!kullanimSayilariMap.containsKey(harfler[i])) {

                kullanimSayilariMap.put(harfler[i], 1);
            } else { //getirilen harf zaten map'de var
                //eski degeri alip, 1 fazlasini alarak yeni deger atamaliyiz

                int eskiKullanimMiktari = kullanimSayilariMap.get(harfler[i]);
                kullanimSayilariMap.put(harfler[i],eskiKullanimMiktari+1 );
            }

                    }

        System.out.println(kullanimSayilariMap); //{a=3, b=3, c=3, d=3, e=2}

        //2. yöntem compute methodlari kullanabiliriz
        kullanimSayilariMap=new HashMap<>();

        for (int i = 0; i < harfler.length; i++) {
            kullanimSayilariMap.computeIfPresent(harfler[i],(k,v)->v+1);
            kullanimSayilariMap.computeIfAbsent(harfler[i],v->1);
        }

        System.out.println(kullanimSayilariMap); //{a=3, b=3, c=3, d=3, e=2}
    }
}
