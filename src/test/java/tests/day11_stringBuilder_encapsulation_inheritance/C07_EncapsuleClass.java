package tests.day11_stringBuilder_encapsulation_inheritance;

public class C07_EncapsuleClass {

    private int satisGirisi;
    private int toplamSatisTutari;

    public String sirketIsmı="Cem Holding";
    private int KapiNumarasi=20;


    public void setSatisGirisi(int satisGirisi) {
        this.satisGirisi = satisGirisi;

        toplamSatisTutari+=this.satisGirisi;
    }

    public int getKapiNumarasi() {
        return KapiNumarasi;
    }

    public void setKapiNumarasi(int kapiNumarasi) {
        KapiNumarasi = kapiNumarasi;
    }

    public int getToplamSatisTutari() {
        return toplamSatisTutari;


    }
}
