package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
     */


    public static void main(String[] args) {

        double uzunlukcm=160000;

        cmToMeter(uzunlukcm);
        cmToKM(uzunlukcm);




    }

    private static void cmToKM(double uzunlukcm) {
        System.out.println(uzunlukcm+ " cm "+uzunlukcm/100000+" kilometredir.");
    }

    private static void cmToMeter(double uzunlukcm) {
        System.out.println(uzunlukcm+ " cm "+uzunlukcm/100+ " metredir.");
    }


}