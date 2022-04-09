package practice_basic_day01;

import java.util.Scanner;

public class Q11_IfStatement02 {

     /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not=scan.nextInt();
         if(not>=90 && not<=100){
             System.out.println("harf notunuz : A");
         }else if(not>=80 && not<=89){
             System.out.println("harf notunuz B");
         }else if(not>=70 && not<=79){
             System.out.println("harf notunuz C");
         }else if(not>=60 && not<=69){
             System.out.println("harf notunuz D");
         }else if(not>=0 && not<=59){
             System.out.println("harf notunuz F");
         }else{
             System.out.println("notunuzu lütfen dogru giriniz");
         }
    }
}
