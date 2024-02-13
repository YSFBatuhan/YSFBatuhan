package HesapMakinesi;

public class HesapMakinesi {
    public static void main(String[] args){
        HesapMakinesiMethods method=new HesapMakinesiMethods();
        System.out.println(method.topla(3,4,6,8,3,6.4));
        System.out.println(method.çıkarma(10,2));
        System.out.println(method.çarpma(100,2,2,3,4));
        System.out.println(method.bölme(256,2,2,2,2,2,4,4));
        System.out.println(method.çikarma(10,2,3,3,4,6,8,21,34,9));
    }
}
