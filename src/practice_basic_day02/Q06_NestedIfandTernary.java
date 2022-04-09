package practice_basic_day02;

import java.util.Scanner;

public class Q06_NestedIfandTernary {
    /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("0 ile 9 arasında rakam ile bir tam sayi yaz, ben de onları kelime olarak yazayım ");
        int sayi=scan.nextInt();

        if(sayi==0){
            System.out.println("sifir");
        }else if(sayi==1) {
            System.out.println("bir");
        }else if(sayi==2) {
            System.out.println("iki");
        }else if(sayi==3) {
            System.out.println("üç");
        }else if(sayi==4) {
            System.out.println("dört");
        }else if(sayi==5) {
            System.out.println("beş");
        }else if(sayi==6) {
            System.out.println("alti");
        }else if(sayi==7) {
            System.out.println("yedi");
        }else if(sayi==8) {
            System.out.println("sekiz");
        }else if(sayi==9) {
            System.out.println("dokuz");
        }else{
            System.out.println("Gecersiz");
        }

        System.out.println((sayi==0?"sifir":sayi==1?"bir":sayi==2?"iki":sayi==3?"üç":sayi==4?"dört":
                sayi==5?"beş":sayi==6?"alti":sayi==7?"yedi":sayi==8?"sekiz":sayi==9?"dokuz":"Gecersiz"));

        switch(sayi){
            case 0: System.out.println("sifir"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
            default:
                System.out.println("Gecersiz");
        }






    }
}
