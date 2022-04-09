package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 tane kelime girin");
        String str1=scan.next();
        String str2=scan.next();
        String str3=scan.next();
        String str4=scan.next();
        String str5=" ";
        String str6=".";

        System.out.println(str1+" "+str2+ " "+str3+ " "+str4+".");
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1).concat(str5.concat(str2.concat(str5.concat(str3.concat(str5.concat(str4.concat(str6))))))));



    }
}
