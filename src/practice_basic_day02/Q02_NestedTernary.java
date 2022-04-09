package practice_basic_day02;

import java.util.Scanner;

public class Q02_NestedTernary {

      /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        //char finalNotu='c';
        Scanner scan=new Scanner(System.in);
        System.out.println("notonuzu girin");
        char finalNotu=scan.next().toUpperCase().charAt(0);

        String sonuc=(finalNotu=='A'?"Gayet Basarili":(finalNotu=='B'?"Basarili":(finalNotu=='C'?"Ha gayret":"Digerleri")));
        System.out.println(sonuc);
    }

}
