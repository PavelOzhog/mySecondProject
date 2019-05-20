package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] mass = {1, 3, 4, 1, 9, 3, 5,};
//        for ( int i = mass.length - 1; i >= 0; i--){
//            System.out.println(mass[i]);
//        }
//        System.out.println(mass[6]);
//        System.out.println(mass[5]);
//        System.out.println(mass[4]);
//        System.out.println(mass[3]);
//        System.out.println(mass[2]);
//        System.out.println(mass[1]);
//        System.out.println(mass[0]);


        for (int i = 7; i >= mass[i]; i = i - 1) {

            System.out.println(mass[i]);


        }


    }
}
