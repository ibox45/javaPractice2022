package practice_basic_day02;

import java.util.Scanner;

public class Q15_StringManipulation09 {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("kelime gir");
        String str=scan.nextLine();


        if (str.length()%2==1 && str.length()>=3){
            System.out.println(str.charAt(str.length()/2));

        }else {
            System.out.println("kelime kriterlere uygun degil");
        }





    }
}