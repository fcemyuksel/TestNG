package tests.day18_NestedMaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_FarkliDataTurleriIleListOlusturma {
    public static void main(String[] args) {

        List<String >isimler=new ArrayList<>();
        isimler.add("Arda");
        isimler.add("Aykut");
        isimler.add("Cem");
        //isimler.add(10);
        //isimler.add(true);
        //isimler.add(new ArrayList<Integer>());

        //gercek hayatta birden fazla data turunu iceren yapilar vardir
        //Javada farkli data turleri ile Lİst gibi yapilar olusturabiliriz

        List<Object> herseyListesi=new ArrayList<>();

        herseyListesi.add("Arda");
        herseyListesi.add(10);
        herseyListesi.add(true);
        herseyListesi.add(isimler);

        System.out.println(herseyListesi);//[Arda, 10, true, [Arda, Aykut, Cem]]

        //listenin ilk elemanı olan Arda'yi buyuk harflerle yazdiralim
        System.out.println(herseyListesi.get(0).toString().toUpperCase()); //ARDA

        System.out.println(((String) herseyListesi.get(0)).toUpperCase()); //ARDA

        //listenin ikinci elemani olan 10'u 3 artirin

        System.out.println((((Integer) herseyListesi.get(1)) + 3));//13

        //listenin son elemani isimler listesinin 3. elemanini yazdirin

        System.out.println(((List) herseyListesi.get(3)).get(2)); //Cem
        System.out.println(((List) herseyListesi.get(3)).get(2).toString().toUpperCase());//CEM

    }
}
