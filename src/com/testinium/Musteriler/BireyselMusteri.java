package com.testinium.Musteriler;

public class BireyselMusteri extends Musteri {

    private String evAdresi;


    public BireyselMusteri(int tcKimlikNo, String adSoyad, double hesapBakiyesi,String evAdresi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.evAdresi=evAdresi;
    }

    public BireyselMusteri(){
        super();
    }

}
