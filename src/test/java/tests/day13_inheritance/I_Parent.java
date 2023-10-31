package tests.day13_inheritance;

import com.fasterxml.jackson.core.json.PackageVersion;

public class I_Parent {
    public void method1(){

    }
    public void method2(String str){

    }
    public void method3(){

    }
    public void method4(){

    }


    public static void method5(){

    } //override edilemez
    private void method6(){} //override edilemez
    final void method7(){} //override edilemez

    void method8(){}

    protected void method9(){}

    void method10(){}

    int method11(){
        return 0;
    }

    Object method12(){ //String is a Object
        return "Java";
    }
}
