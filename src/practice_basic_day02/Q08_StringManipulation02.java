package practice_basic_day02;

import java.util.Scanner;

public class Q08_StringManipulation02 {

		 //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("String 1 : ");
        String str1=scan.nextLine();
        System.out.println("String  : ");
        String str2=scan.nextLine();


        System.out.println("Stringlerin 1. method ile birlesimi : "+str1+ " "+str2);
        System.out.println("Stringlerin 2. method ile birlesimi : "+str1.concat(" "+str2));


        String strilksiz= str1.substring(1)+" "+str2.substring(1);
        System.out.println("ilk harfsiz halleri : "+strilksiz);

        System.out.println(str1.substring(1,4));  //1 dahil 4 hariç

        String a="parlak";
        System.out.println(a.substring(0,a.length()-1));










    }
}
