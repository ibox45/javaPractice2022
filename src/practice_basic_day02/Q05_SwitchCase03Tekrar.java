package practice_basic_day02;

import java.util.Scanner;

public class Q05_SwitchCase03Tekrar {

    // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();


        switch((sayi/10)%10){

            case 0:
                System.out.println("sifir");
                break;
            case 1 :
                System.out.println("bir");
                break;

            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;

                //negatif sayılar için

            case -1 :
                System.out.println("bir");
                break;
            case -2:
                System.out.println("iki");
                break;
            case -3:
                System.out.println("üç");
                break;
            case -4:
                System.out.println("dört");
                break;
            case -5:
                System.out.println("beş");
                break;
            case -6:
                System.out.println("alti");
                break;
            case -7:
                System.out.println("yedi");
                break;
            case -8:
                System.out.println("sekiz");
                break;
            case -9:
                System.out.println("dokuz");
                break;


        }





    }

}
