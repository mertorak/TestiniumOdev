package com.testinium.MusteriBilgileri;

import com.testinium.Musteriler.BireyselMusteri;
import com.testinium.Musteriler.KurumsalMusteri;
import com.testinium.Musteriler.Musteri;

import java.util.ArrayList;
import java.util.List;

public class MusteriIslemleri {

    public List<Musteri> musteriBilgileri = new ArrayList<>();

    public MusteriIslemleri (){
        this.musteriBilgileri.add(new BireyselMusteri(1111111111, "Maral", 1000.0D, "Şişli"));
        this.musteriBilgileri.add(new KurumsalMusteri(1122222222, "Mert", 2000.0D, "Testinium"));
        this.musteriBilgileri.add(new KurumsalMusteri(1133333333, "Berk", 3000.0D, "Civil"));
        this.musteriBilgileri.add(new BireyselMusteri(1114444444, "Hülya", 4000.0D, "Bakırköy"));
        this.musteriBilgileri.add(new BireyselMusteri(1115555555, "Bülent", 5000.0D, "Yeşilköy"));
    }

    /* public Musteri musteriCekme (int tc){
       Musteri musteri = new Musteri();
        for(int i=0; musteriBilgileri.size()<=5; i++){
            if(musteriBilgileri.get(i).getTcKimlikNo() == tc){
                musteri = musteriBilgileri.get(i);
            }

        }
      return musteri;
    } */



}
