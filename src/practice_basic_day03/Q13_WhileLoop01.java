package practice_basic_day03;

import java.util.Scanner;

public class Q13_WhileLoop01 {
    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı gir");
        int sayi=scan.nextInt();

        System.out.println(basamakToplama(sayi));
        basamakToplamaDoWhile(sayi);


            
        }

    private static void basamakToplamaDoWhile(int sayi) {
        int toplam=0;
        do {
            toplam+=sayi%10;
            sayi=sayi/10;
            System.out.println("Basamaklarin Toplami = " + toplam + " \nkalan sayi " + sayi);
        }while (sayi>0);
        System.out.println("Do while ile Toplam = " + toplam);



    }

    private static  int basamakToplama(int sayi) {
        int toplam=0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
    }
        return toplam;

}




}