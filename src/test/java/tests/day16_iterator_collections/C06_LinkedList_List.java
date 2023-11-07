package tests.day16_iterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C06_LinkedList_List {
    public static void main(String[] args) {

        List<Integer> sayilar=new LinkedList<>();
        System.out.println(sayilar.hashCode());//1

        sayilar.add(10);
        sayilar.add(13);
        sayilar.add(2);
        System.out.println(sayilar);//[10, 13, 2]

        sayilar.add(1,25);

        System.out.println(sayilar);//[10, 25, 13, 2]

        System.out.println(sayilar.hashCode());//1245861

        List<Integer> ikinciList=new LinkedList<>();
        ikinciList.add(43);
        ikinciList.add(25);
        System.out.println(ikinciList);//[10, 25]

        System.out.println(ikinciList.retainAll(sayilar)); // true

        //ikinciList'den sayilarda bulunmayan elementleri siler
        //eger 1 tane de olsa element silerse true
        //hic element silmezse false verir

        System.out.println(ikinciList); // [25]
    }
}
