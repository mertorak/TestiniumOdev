package com.testinium.Musteriler;

public class KurumsalMusteri extends Musteri {

    private String sirketAdi;


    public KurumsalMusteri(int tcKimlikNo, String adSoyad, double hesapBakiyesi, String sirketAdi) {
        super(tcKimlikNo, adSoyad, hesapBakiyesi);
        this.sirketAdi=sirketAdi;
    }

    public KurumsalMusteri() {
        super();
    }
}
