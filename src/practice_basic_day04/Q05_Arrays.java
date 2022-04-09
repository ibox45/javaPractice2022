package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {

         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        System.out.println("8 elemanli bir array olusturacaksiniz ");
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[8];
        int sayac=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+". elemani giriniz : ");
            arr[i]=scan.nextInt();
           if (arr[i] %3==0){
               sayac++;

           }

        }
        System.out.println("");
        System.out.println(Arrays.toString(arr)+ " bu arrayin icinde "+sayac+ " tane 3'e bölünen sayi vardir.");



    }
}
