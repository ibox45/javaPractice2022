package practice_basic_day02;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("4 harfli kelime yazin");
        String kelime=scan.nextLine();

        String terstenKelime=kelime.substring(kelime.length()-1)+
                kelime.substring(kelime.length()-2,kelime.length()-1)+
                        kelime.substring(kelime.length()-3,kelime.length()-2)+
                                kelime.substring(kelime.length()-4,kelime.length()-3);
        System.out.println(terstenKelime);


    }
}
