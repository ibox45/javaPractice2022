package practice_basic_day01;

import java.util.Scanner;

public class Q08_Scanner01 {

    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi1=scan.nextInt();


        System.out.println("bir sayi daha girer misiniz");
        int sayi2=scan.nextInt();


        System.out.println("yazdıgınız iki tam sayinin toplami : "+(sayi1+sayi2));
    }
}
