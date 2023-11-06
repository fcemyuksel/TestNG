package tests.day16_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_iteratorKullanimi {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(10);
        sayilar.add(16);
        sayilar.add(6);
        sayilar.add(34);
        sayilar.add(24);
        sayilar.add(19);
        sayilar.add(22);

        System.out.println(sayilar);//[10, 16, 6, 34, 24, 19, 22]

        Iterator iterator= sayilar.iterator();

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());//10
        iterator.remove();

        System.out.println(sayilar);//[16, 6, 34, 24, 19, 22]

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());//16
        iterator.remove();

        System.out.println(sayilar); //[6, 34, 24, 19, 22]

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(sayilar); //[34, 24, 19, 22]

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(sayilar); //[24, 19, 22]

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(sayilar); //[19, 22]

        System.out.println(iterator.hasNext()); //true
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(sayilar); //[19]


        System.out.println(iterator.hasNext());//false
        iterator.next();//NoSuchElementException

    }
}
