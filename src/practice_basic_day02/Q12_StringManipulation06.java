package practice_basic_day02;

import java.util.Scanner;

public class Q12_StringManipulation06 {

		/* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

          ORNEK:          INPUT     OUTPUT
                          goat        gat
                         photo        hoto
                         ghost        ghost
                         kalem        lem


		 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String str=scan.nextLine().toLowerCase();

        if(str.charAt(0)=='g'  && str.charAt(1)=='h'){
            System.out.println("g ve h harfi de oldugu için kelimenin tamamını yazdım : "+str);
        }else if (str.charAt(0)=='g'){
            System.out.println("sadece ilk harf g oldugu için onu aldım ikinci harfi almadım : "+str.substring(0,1)+str.substring(2));

        }else if (str.charAt(1)=='h'){
            System.out.println("sadece ikinci harf h oldugu için onu aldım ilk harfi almadım : "+str.substring(1));
        }else {
            System.out.println("kelimenin ilk harfi g değil ikinci harfi h değil o yüzden iki harfi de almadım : "+str.substring(2));
        }





    }
  }
