package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz");
        String isim= scan.next();
        String soyisim= scan.next();



        if(isim.length()>soyisim.length()){
            System.out.println("isminiz daha uzun: "+isim);
        }else if (isim.length()<soyisim.length()){
            System.out.println("soyisminiz daha uzun: "+soyisim);
        }else {
            System.out.println("isminiz ve soyisminiz eşit sayıda harf iceriyor");
        }


    }

}
