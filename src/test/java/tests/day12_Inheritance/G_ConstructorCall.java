package tests.day12_Inheritance;

public class G_ConstructorCall {

    int sayi=20;
    String str="Java";

    G_ConstructorCall(){
        System.out.println("parametresiz cons");
         }
    G_ConstructorCall(String str){                                  //3
        this(3);                                               //4
        str="Tava";                                                 //10
        System.out.println("String parametreli cons");              //11
        System.out.println(str);                                    //12
    }                                                               //13
   G_ConstructorCall(int sayi){                                     //5
        this.sayi=sayi;                                             //6
        System.out.println("int parametreli cons");                 //7
        System.out.println(sayi);                                   //8
    }                                                               //9
    public static void main(String[] args) {                        //1
        G_ConstructorCall obj1=new G_ConstructorCall("cem");        //2
        System.out.println(obj1.sayi);                              //14
        System.out.println(obj1.str);                               //15
    }                                                               //16
}
