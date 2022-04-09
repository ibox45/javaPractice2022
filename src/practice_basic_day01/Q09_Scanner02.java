package practice_basic_day01;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Adınız : ");
        String ad = scan.nextLine();
        System.out.print("Memleketiniz : ");
        String memleket = scan.next();
        System.out.print("Nerede yasiyorsunuz : ");
        String yasadigiYer = scan.next();
        System.out.print("Yaşınız : ");
        byte yas = scan.nextByte();
        System.out.print("boyunuz(cm olarak) : ");
        short boy = scan.nextShort();
        System.out.println("yaşadıgınız yeri(" + yasadigiYer + ") seviyor musunuz true/false yazın");
        boolean seviyorMu = scan.nextBoolean();


        System.out.println("*********************");
        System.out.println("ad = " + ad);
        System.out.println("memleket = " + memleket);
        System.out.println("yasadigiYer = " + yasadigiYer);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);

        if (seviyorMu) {
            System.out.println("yaşadığı yeri(" + yasadigiYer + ") seviyor.");
        } else {
            System.out.println("yaşadığı yeri(" + yasadigiYer + ") sevmiyor.");
        }


        }

    }

