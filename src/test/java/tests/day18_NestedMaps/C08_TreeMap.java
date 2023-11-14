package tests.day18_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C08_TreeMap {
    public static void main(String[] args) {
        Map<String ,Integer> harfler1=new TreeMap<>();

        /*
        Inheritance'dan bildigimiz uzere
        eger data turu olarak parent class olan Map secilirse
        olusturulan map treeMap olsa da tum Map'lerin ortak ozelliklerini gosterebilir

        Eger data turu de treeMap secilirse
        En guncel methodlara sahip olur
         */

        TreeMap<String ,Integer> harfler2=new TreeMap<>();
        harfler2.put("H",50);
        harfler2.put("Z",40);
        harfler2.put("T",30);
        harfler2.put("M",20);
        harfler2.put("J",10);

        System.out.println(harfler2); //{H=50, J=10, M=20, T=30, Z=40}

        System.out.println(harfler2.higherKey("M")); //T  ===>> higherKey  daha buyuk
        System.out.println(harfler2.higherKey("K")); //M
        //K harfi arrayde yok ama olsa nerede olurdu diye degerlendirip ona gore K'dan bir buyuk harfi getirir

        System.out.println(harfler2.ceilingKey("M"));//yukari yuvarlar  M (M oldugu icim M verir)
        System.out.println(harfler2.ceilingKey("K"));// M verir (K olmadigi icin M'ye yuvarliyor)

    }
}
