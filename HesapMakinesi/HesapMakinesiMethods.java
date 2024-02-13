package HesapMakinesi;

public class HesapMakinesiMethods {
    double toplam = 0;


    double sayılar[] = new double[3];

    public double topla(double... sayılar) {
        for (double sayıs : sayılar) {
            toplam = toplam + sayıs;

        }
        return toplam;
    }

    public double çıkarma(double sayı1, double sayı2) {

        double sonuc = sayı1 - sayı2;
        return sonuc;
    }
    public double çikarma(double... sayılar) {
        double sonuc=sayılar[0]*2;
        for (double sayı:sayılar){//10,2
            sonuc=sonuc-sayı;
        }
        return sonuc;
    }

    public double bölme(double... sayılar){
        double sonuc=sayılar[0]*sayılar[0];

        for (double sayı:sayılar){
            sonuc=sonuc/sayı;
        }
        return sonuc;
    }
    public double çarpma(double... sayılar){
        double sonuc=1;
        for (double sayı:sayılar){
            sonuc=sonuc*sayı;
        }
        return sonuc;
    }


}
