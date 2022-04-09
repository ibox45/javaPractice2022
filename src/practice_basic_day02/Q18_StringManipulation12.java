package practice_basic_day02;

import java.util.Scanner;

public class Q18_StringManipulation12 {
    // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
    // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("kelime yazin");
        String kelime=scan.nextLine();

        boolean boslukVarMi=kelime.contains(" ");
        if(boslukVarMi){
            System.out.println("bosluk karakteri mevcut");
        }else{
            System.out.println("bosluk karakateri yok");
        }

        boolean bosMu=kelime.isEmpty();
        System.out.println(bosMu);

    }

}