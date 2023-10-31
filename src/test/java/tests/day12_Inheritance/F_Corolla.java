package tests.day12_Inheritance;

public class F_Corolla extends E_Toyota{

    String model="Corolla";
    String renk="belirlenen 5 renk kullanilir";
    String guvenlik="Abs ve 8 airbag";
    String uretimYeri="Turkiye";

    public static void main(String[] args) {

        /*
            Bir class extends keyword kullanarak baska bir class'i parent edinirse
                1- parent class'daki TUM OZELLIKLERI sahiplenir
                2- Eger isterse parent class'da bulunan ozellikleri kendisine uyarlayabilir
                3- Veya parent class'da olmayan spesifik ozellikleri varsa
                   bunlari kendi class'ina ekleyebilir.
         */

        F_Corolla corolla=new F_Corolla();
        System.out.println(corolla.marka); //Toyota classından Toyota
        System.out.println(corolla.model); //Corolla classından Corolla
        System.out.println(corolla.renk); //Corolla classından belirlenen 5 renk kullanilir
        System.out.println(corolla.yil); //D Araba Classından 1900
        System.out.println(corolla.uretimYeri); // Corolla clasından Turkiye
        System.out.println(corolla.aku); // Toyota classından Inci aku
        System.out.println(corolla.motor); //Toyota classından Toyota araclar toyota motorlari kullanir
        System.out.println(corolla.guvenlik);// Corolla clasından Abs ve 8 airbag


    }


}
