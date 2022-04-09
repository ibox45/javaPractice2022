package practice_basic_day01;

public class Q02_Println_vs_Print {
    /* println() ve print() arasında tek fark var;
    println satır atlıyor, print ise imlecin aynı satırda kalmasını sağlıyor.
     */

    public static void main(String[] args) {

        System.out.println("****println");
        System.out.println("Welcome");
        System.out.println("to");
        System.out.println("Java");
        System.out.println("Class");

        System.out.println("****print***");
        System.out.print("welcome ");
        System.out.print("to ");
        System.out.print("Java ");
        System.out.println("Class");




        /*
        konsolda
        1
        2
        3
        4
        5
        yazdiriniz
        sonrasında da yanyana 12345 yazdiriniz
         */

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.print(1);
        System.out.print(2);
        System.out.print(3);
        System.out.print(4);
        System.out.println(5);


    }
}
