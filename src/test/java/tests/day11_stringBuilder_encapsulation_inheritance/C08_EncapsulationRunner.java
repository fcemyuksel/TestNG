package tests.day11_stringBuilder_encapsulation_inheritance;

public class C08_EncapsulationRunner {
    public static void main(String[] args) {

        C07_EncapsuleClass obj=new C07_EncapsuleClass();
        System.out.println(obj.sirketIsmı);

        obj.sirketIsmı="Defne Triko";
        System.out.println(obj.sirketIsmı);
        //System.out.println(obj.satisGirisi);
        //System.out.println(obj.toplamSatisTutari);

        //obj.kapiNumarasi=30;

        obj.setKapiNumarasi(30);
        System.out.println(obj.getKapiNumarasi()); //30

        /*
        Encapsulation bir classdaki class uyelerine erisim
        ve degistirme yetkisini birbirinden ayirmak icin kullanilir

        Bu ayrimi yapabilmek icin:
        1- oncelikle access modifier ile erisimi engellemek icin
        encapsule edilecek class uyelerinin access modşfier'i
        private yapilir
        2- Deger atamasi yapilsin ama deger gorulmesin
        dedigimiz class uyeleri icin setter() methodu olustururuz
        3- Gorunebilsin ama deger atamasi yapilamasin dedigimiz
        class uyeleri icin ise getter() olustururuz
        4- eger encapsule edilen bir variable icin hem getter()
        hem de setter() olusturursaniz public yapmak ile ayni islevlere sahip olur
        yani hem setter() ile deger atayabilir
        hem de getter() ile atanmis degeri gorebilirsiniz

        Bu kullanimi tercih edenlerin tercih sebebi
        bu get ve set islemine VURGU YAPMAKTIR

         */

        obj.setSatisGirisi(100);
        obj.setSatisGirisi(50);
        obj.setSatisGirisi(40);
        obj.setSatisGirisi(30);
        obj.setSatisGirisi(35);

        System.out.println(obj.getToplamSatisTutari());
       // obj.toplamSatisTutari=250;  getter veya setter olmadigi icin ulaşamayız
        //'toplamSatisTutari' has private access in 'tests.day11_stringBuilder_encapsulation_inheritance.C07_EncapsuleClass'


    }
}
