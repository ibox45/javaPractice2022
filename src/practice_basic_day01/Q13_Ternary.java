package practice_basic_day01;

public class Q13_Ternary {

    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */

    public static void main(String[] args) {


        int fiyat=15;

        String sonuc= (fiyat<10?"ucuz":(fiyat>=20?"pahali":"normal"));
        System.out.println(sonuc);



        if (fiyat<10){
            System.out.println("ucuz");
        }else if (fiyat>=20){
            System.out.println("pahali");
        }else System.out.println("normal");
    }
}
