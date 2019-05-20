package home;

public class Main5 {
    public static void main(String[] args) {

        // сумма чисел, делящихся без остатка на 7 и сумма чисел делящихся без остатка на 19


        int summSev = 0;

       int summNth = 0;

        for (int i = 50; i <= 1000; i++) {


        int nineteen = i % 19;
        int seven = i % 7;
            if (nineteen <= 0) {

            summNth = summNth + i ;

            }


            if (seven <= 0  ){
                if (nineteen <= 0) {

                    summSev = summSev + i ;

                }


            }


    }
        System.out.println( "Сумма чисел делящихся без остатка на 19 равна " +summNth);
        System.out.println( "Сумма чисел делящихся без остатка на 7 равна " +summSev);



    }


}
