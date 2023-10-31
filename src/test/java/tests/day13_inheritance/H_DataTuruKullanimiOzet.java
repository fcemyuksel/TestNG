package tests.day13_inheritance;

public class H_DataTuruKullanimiOzet {

    /*

    Eger bir obje olusturulurken
    -Data turu ve constructor AYNI ise
        o classa gider ilk buldugumuz variable/methodu kullanir
        bulamazsak CTE olur

    -Data turu ve constructor FARKLI ise
        Aramaya data turunun oldugu classtan baslariz
            - Eger aradigimiz method/variable yoksa CTE olur
            - Aradigimiz ozelligi bulursak
                * ozellik variable ise buldugumuzu kullaniriz
                * ozellik method ise ONCE constructora kadar
                daha guncel bir method var mi diye kontrol ederiz
                ve en guncel methodu kullaniriz
     */
}
