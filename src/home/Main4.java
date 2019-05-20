package home;

public class Main4 {
    public static void main(String[] args) {


        for (int i = 500; i <= 1000; i++) {

            int nineteen = i % 19;
            int seven = i % 7;

            if (nineteen <= 0) {
                System.out.println(i);
            }

            if (seven <= 0  ){
                System.out.println( "   "  + i);
            }


        }


    }
}





