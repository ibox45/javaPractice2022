package practice_basic_day03;

import java.util.Scanner;

public class Q12_MetCreationForLoop {

		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();


        reverseString(str);


    }

    private static void reverseString(String str) {
        String tersStr="";
        for (int i = 0; i < str.length(); i++) {
            tersStr+=str.charAt((str.length()-1-i));


        }
        System.out.println(tersStr);
    }

}
