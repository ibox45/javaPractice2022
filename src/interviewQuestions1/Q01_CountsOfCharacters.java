package interviewQuestions1;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharacters {
    public static void main(String[] args) {

         /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str = scan.nextLine();

        String[] arr = str.split("");
        Arrays.sort(arr);

        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].contains(arr[i])) {
                sayac++;
            } else {
                System.out.println(arr[i - 1] + " sayisi " + (sayac+1 ));
               sayac = 0;
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " sayisi " + (sayac+1 ));
            }


        }
    }}
