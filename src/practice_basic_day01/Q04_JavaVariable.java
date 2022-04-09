package practice_basic_day01;

public class Q04_JavaVariable {
    public static void main(String[] args) {

        //Initializing Variable
        int age = 32;
        int temp = 52;   //temporary
        System.out.println(age);
        System.out.println("temp= " + temp);

        //To copy the variable's value

        int myAge = 33;
        int hisAge = myAge;

        //you can declare multiple variables in the same line

        int year = 2022, month = 3, day = 2;

        //updating a variable

        year = 2032;

        //Bir degisken tanimlayin : x

        int x;

        //Baska bir degiskeni initialize edin : y

        int y = 20000;
        System.out.println("y = " + y);


        //x degiskenini initialize edin

        x = 123;
        //y degiskenini yeni bir degerle guncelleyin
        y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


    }
}
