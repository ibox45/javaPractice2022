package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01Tekrar {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("yapacaginiz dort islemi * + - / olarak seciniz :");
        char islem=scan.next().charAt(0);

        System.out.println("sayi 1 gir : ");
        double sayi1=scan.nextDouble();

        System.out.println("sayi 2 gir : ");
        double sayi2=scan.nextDouble();

        hesapmakinesi(islem,sayi1,sayi2);
    }

    private static void hesapmakinesi(char islem, double sayi1, double sayi2) {

        switch(islem){
            case '+':
                System.out.println(sayi1+ "+"+sayi2+"="+(sayi1+sayi2));
                break;
            case '-':
                System.out.println(sayi1+ "-"+sayi2+"="+(sayi1-sayi2));
                break;
            case '*':
                System.out.println(sayi1+ "*"+sayi2+"="+(sayi1*sayi2));
                break;
            case '/':
                System.out.println(sayi1+ "/"+sayi2+"="+(sayi1/sayi2));
                break;
            default:
                System.out.println("hatalı giriş yaptınız");

        }
    }
}
