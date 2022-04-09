package practice_basic_day03;

import java.util.Scanner;

public class Q14_WhileLoop02 {
    /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayi=scan.nextInt();

        int sayi2=0;
        while (sayi>=sayi2){
            if (sayi2%2==1){
                System.out.print(sayi2+" ");
            }
sayi2++;
        }
    }

}
