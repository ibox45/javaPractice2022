package practice_basic_day01;

import java.util.Scanner;

public class Q07_Converting {

     /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon
        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

    public static void main(String[] args) {

        int gallon=1000;
        double litre=gallon*3.785;
        System.out.println(gallon+" gallon "+litre+" litredir");

        int litre2=1000;
        double gallon2=litre2/3.785;
        System.out.println(litre2+" litre "+gallon2+" gallondur");


        Scanner scan=new Scanner(System.in);
        System.out.println("fahrenhayt gir santigrat yapayım");

        double fahrenhayt=scan.nextDouble();
        System.out.println((fahrenhayt-32)*5/9);



    }

}
