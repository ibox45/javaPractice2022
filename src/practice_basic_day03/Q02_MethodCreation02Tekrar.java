package practice_basic_day03;

public class Q02_MethodCreation02Tekrar {/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {

        birKereYazdir1("aabbcccccddddaaa");

    }

    private static void birKereYazdir1(String str) {

        String sonuc="";

        for (int i = 0; i < str.length(); i++) {
            if(!sonuc.contains(str.substring(i,i+1))) {
                sonuc+=str.substring(i,i+1);

            }

        }
        System.out.println(sonuc);

    }
}
