package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */


        int arr[] = {2, 5, 3, 9, 8, 12, 6, 7, 4, 11};
        int n = 4;

        //bir list olusturalım

        List<Integer> list = new ArrayList<>();

        for (int each:arr){
            list.add(each);

        }
        List<Integer> newList = new ArrayList<>();
        int count = 1;

        while(count<=n){
            int max=list.get(0);

            for (int i = 0; i < list.size(); i++) {
                if(list.get(i)>max){
                    max=list.get(i);
                }

            }
            newList.add(max);
            list.remove(list.indexOf(max));  //buldugumuz en buyuk sayıyı ilk listten siliyoruz.
            count++;
        }
        System.out.println("Arrayin ilk " + n + " maksimum degerleri : " + newList);


    }
}
