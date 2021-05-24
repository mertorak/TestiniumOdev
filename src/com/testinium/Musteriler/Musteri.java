package com.testinium.Musteriler;

public class Musteri {

    private int tcKimlikNo ;
    private String adSoyad ;
    private double hesapBakiyesi;

    public Musteri(int tcKimlikNo, String adSoyad, double hesapBakiyesi) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public Musteri() {

    }


    public int getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public double getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi) {
        this.hesapBakiyesi = hesapBakiyesi;
    }

    public void paraYatirma(int tutar){

        this.hesapBakiyesi = hesapBakiyesi + tutar ;

        System.out.println("Güncel bakiyeniz" + hesapBakiyesi);

    }

    public void paraCekme(int tutar){
        if (tutar>hesapBakiyesi){
            System.out.println("Yeterli bakiyeniz bulunmamakta");
        }
        else{
            hesapBakiyesi = hesapBakiyesi- tutar;
            System.out.println("Para çektikten sonraki bakiyeniz :" + hesapBakiyesi);
        }
    }
}
