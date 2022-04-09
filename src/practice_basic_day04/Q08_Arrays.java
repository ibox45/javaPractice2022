package practice_basic_day04;

public class Q08_Arrays {
    public static void main(String[] args) {

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 14.75 ile carp
         *  String de € varsa 16.05 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String arr[][]={{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        double toplam=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j].contains("$")){
                    toplam+= Double.valueOf(arr[i][j].replace("$", ""))*14.75;  //Double.parseDouble() 'da aynı işi yapar.
                }else if(arr[i][j].contains("€")){
                    toplam+= Double.valueOf(arr[i][j].replace("€", ""))*16.05;
                }



            }


        }
        System.out.println("toplam = " + toplam);
    }
}
