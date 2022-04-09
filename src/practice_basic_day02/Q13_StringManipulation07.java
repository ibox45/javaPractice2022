package practice_basic_day02;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {

        String str="xyabcbv";


        boolean kontrol=str.contains("xyz");
        System.out.println(kontrol);

        xyzIceriyorMu(str);


    }

    private static void xyzIceriyorMu(String str) {
        boolean kontrol1=false;
        if(str.contains("xyz")){
            kontrol1=true;
        }else if
            (!str.contains("xyz")){
            kontrol1=false;
        }
        System.out.println(kontrol1);

    }


}
