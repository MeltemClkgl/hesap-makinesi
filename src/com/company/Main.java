package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // toplama
        // cikarma
        // bolme
        // carpma
        // ussunu alma

        //kullanici islem sececek (input)
        //kullanici isleme gore sayilar girecek (input)
        //kullanici cikmak istediginde cikacak

        hesapMakinesi();

        }

    static void toplama(int a, int b) {
        String devam;
        int sonuc = a+b;
        System.out.println(a + " + " + b + " = " + sonuc + "\n");
        System.out.println("Devam etmek icin (Y) yaziniz");
        islemDevam();
    }

    static void cikarma(int a, int b) {
        int sonuc = a - b;
        System.out.println(a + " - " + b + " = " + sonuc + "\n");
        islemDevam();
    }

    static void bolme(double a, double b) {
        double sonuc = a/b;
        System.out.println(a + " / " + b + " = " + sonuc + "\n");
        islemDevam();
    }

    static void carpma(int a, int b) {
        int sonuc = a*b;
        System.out.println(a + " * " + b + " = " + sonuc + "\n");
        islemDevam();
    }

    static void power(int a, int b) {
        long sonuc = 1;
        for(int i = 0; i < b; i++){
            sonuc = sonuc*a;
        }

        System.out.println(a + " ^ " + b + " = " + sonuc + "\n");
        islemDevam();


    }

    static void hesapMakinesi() {
        int a, b, islem;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem seciniz: \n" +
                "1- Toplama \n" +
                "2- Cikarma \n" +
                "3- Carpma \n" +
                "4- Bolme \n" +
                "5- Ussunu alma \n" +
                "6- Cikis Yapmak Istiyorum: ");
        islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama Islemi");
                System.out.println("Lutfen ilk sayiyi giriniz: ");
                a = scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz: ");
                b = scan.nextInt();

                toplama(a, b);


            case 2:
                System.out.println("Cikarma Islemi");
                System.out.println("Lutfen ilk sayiyi giriniz: ");
                a = scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz: ");
                b = scan.nextInt();

                cikarma(a, b);

            case 3:
                System.out.println("Carpma Islemi");
                System.out.println("Lutfen ilk sayiyi giriniz: ");
                a = scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz: ");
                b = scan.nextInt();

                carpma(a, b);

            case 4:
                System.out.println("Bolme Islemi");
                System.out.println("Lutfen ilk sayiyi giriniz: ");
                a = scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz: ");
                b = scan.nextInt();

                bolme(a, b);

            case 5:
                System.out.println("Us Hesaplama Islemi");
                System.out.println("Lutfen ilk sayiyi giriniz: ");
                a = scan.nextInt();
                System.out.println("Lutfen ikinci sayiyi giriniz: ");
                b = scan.nextInt();

                power(a, b);

            case 6:
                System.out.println("Gule Gule :D");
                break;

            default:
                System.out.println("Yanlis secim yaptiniz lutfen tekrar deneyiniz: ");
                hesapMakinesi();
        }
    }

    static void islemDevam(){
        Scanner devam = new Scanner(System.in);
        System.out.println("Devam etmek istiyorsaniz (Y) yaziniz: ");
        String kullanici = devam.nextLine();

        if(kullanici.equals("Y") || kullanici.equals("y"))
            hesapMakinesi();
        else
            System.out.println("Gule Gule :D");
            System.exit(0);
    }
}


