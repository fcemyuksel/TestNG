package tests.day18_NestedMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C07_ComputeMethodlari {
    public static void main(String[] args) {

        Map<String , Integer> harfler=new TreeMap<>();

        harfler.put("H",50);
        harfler.put("Z",40);
        harfler.put("T",30);
        harfler.put("M",20);
        harfler.put("J",10);

        System.out.println(harfler);//{H=50, J=10, M=20, T=30, Z=40}

        //H'nin degerini 5 artirin
        int eskiDeger= harfler.get("H");
        harfler.put("H",eskiDeger+5);
        System.out.println(harfler);//{H=55, J=10, M=20, T=30, Z=40}

        //J'nin degerini 2 katina cikarin

        harfler.put("J",harfler.get("J")*2);
        System.out.println(harfler);//{H=55, J=20, M=20, T=30, Z=40}

        //M'nin degerini 5 azaltin

        harfler.compute("M",(k,v)->v-5);
        System.out.println(harfler);//{H=55, J=20, M=15, T=30, Z=40}

        //T'nin degerini 3 katina cikarin

        harfler.compute("T",(k,v)->v*3);
        System.out.println(harfler);//{H=55, J=20, M=15, T=90, Z=40}

        //olmayan bir harf icin bu methodu kullanirsak

        //harfler.compute("A",(k,v)->v+6);
        //System.out.println(harfler); //NullPointerException

        harfler.computeIfPresent("A",(k,v)->v+6);
        System.out.println(harfler);

        //varsa Z'nin degereini 1 artirin
        harfler.computeIfPresent("Z",(k,v)->v+1);
        System.out.println(harfler); //{H=55, J=20, M=15, T=90, Z=41}

        //A yoksa degeri 22 olarak olusturun

        harfler.computeIfAbsent("A",v->22);
        System.out.println(harfler); //{A=22, H=55, J=20, M=15, T=90, Z=41}

        //B yoksa degeri 1 olarak ekleyin

        harfler.putIfAbsent("B",1);
        harfler.putIfAbsent("A",10);

        System.out.println(harfler);//{A=22, B=1, H=55, J=20, M=15, T=90, Z=41}
    }
}
