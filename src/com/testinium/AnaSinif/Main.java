package com.testinium.AnaSinif;

import com.testinium.MusteriBilgileri.MusteriIslemleri;
import com.testinium.Musteriler.BireyselMusteri;
import com.testinium.Musteriler.KurumsalMusteri;
import com.testinium.Musteriler.Musteri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        KurumsalMusteri kurumsalMusteri = new KurumsalMusteri();
        BireyselMusteri bireyselMusteri = new BireyselMusteri();
        MusteriIslemleri musteriIslemleri = new MusteriIslemleri();

        for (Musteri kayitliKisi : musteriIslemleri.musteriBilgileri) {
            System.out.println("Ad Soyad:" + kayitliKisi.getAdSoyad() +
                    " TC Kimlik No:" + kayitliKisi.getTcKimlikNo() +
                    " Bakiye: " + kayitliKisi.getHesapBakiyesi());
        }


        Scanner scanner = new Scanner(System.in);

        System.out.println("ATM uygulamasına hoşgeldiniz");
        System.out.println("-----------");

        String musteriler = ("1)Bireysel Müşteri \n" + "2)Kurumsal Müşteri");

        System.out.println("**************");
        System.out.println(musteriler);
        System.out.println("**************");

       /* System.out.println("Lutfen tc giriniz");
        String dogrulama = scanner.nextLine();

        if(dogrulama.equals("1111111111")){
            System.out.println("Hoşgeldiniz Maral hanım");
        } */


        while (true){
            System.out.println("İşlem seçiniz");
            String musteriTip = scanner.nextLine();

            if (musteriTip.equals("1")){
                System.out.println("Hoş geldiniz");

                while (true){
                    System.out.println("Para çekmek için 1'e basınız \n"+
                            "Para yatırmak için 2'ye basınız");
                    String islemler = scanner.nextLine();

                    if(islemler.equals("1")){
                        System.out.println("Çekmek istediginiz tutarı giriniz");
                        int cekilecekTutar = scanner.nextInt();
                        bireyselMusteri.paraCekme(cekilecekTutar);
                        break;
                    }
                    else if(islemler.equals("2")){
                        System.out.println("Yatırmak istediğiniz tutarı giriniz");
                        int yatirilacakTutar = scanner.nextInt();
                        bireyselMusteri.paraYatirma(yatirilacakTutar);
                        break;
                    }
                    else{
                        System.out.println("Geçersiz işlem yaptınız");
                        break;
                    }
                }
                break;
            }


            else if(musteriTip.equals("2")){
                System.out.println("Hoş geldiniz");

                while (true){

                    System.out.println("Para çekmek için 1'e basınız \n"+
                            "Para yatırmak için 2'ye basınız");
                    String islemler2 = scanner.nextLine();
                    if(islemler2.equals("1")){
                        System.out.println("Çekmek istediginiz tutarı giriniz");
                        int cekilecekTutar = scanner.nextInt();
                        kurumsalMusteri.paraCekme(cekilecekTutar);
                        break;
                    }
                    else if(islemler2.equals("2")){
                        System.out.println("Yatırmak istediğiniz tutarı giriniz");
                        int yatirilacakTutar = scanner.nextInt();
                        kurumsalMusteri.paraYatirma(yatirilacakTutar);
                        break;
                    }
                    else{
                        System.out.println("Geçersiz işlem yaptınız");
                        break;
                    }
                }
                break;
            }

            else {
                System.out.println("1 veya 2 ye basınız.");
            }
        }
    }
}


