package interviewQuestions1;

public class Q05_ForFlashBack_Q01 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        String  cumle= "Java ogrEnmek cok guzel.";
        String harf="e";

        int sayac=0;

        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.toLowerCase().charAt(i) == 'e'){
                sayac++;

            }

        }
        System.out.println(harf+ " karakteri cumlede "+ sayac+" tanedir.");

    }
}
