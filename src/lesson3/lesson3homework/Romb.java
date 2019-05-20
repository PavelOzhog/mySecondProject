package lesson3.lesson3homework;

import java.util.Scanner;

public class Romb {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("что вы хотите посчитать: периметр или площадь?");

        String inputMain = enter.next();
        if (inputMain.equals("площадь")) {


            System.out.println("какие данные вам известны: стророна и высота или диагонали?");
            String input = enter.next();


            if (input.equals("сторона")) {
                System.out.println("введите высоту ромба");
                int rombH = enter.nextInt();
                System.out.println("введите длину стороны ромба");
                int rombSide = enter.nextInt();


                System.out.println("площадь ромба равна " + (rombH * rombSide));

            } else if (input.equals("высота")) {
                System.out.println("введите высоту ромба");
                int rombH = enter.nextInt();
                System.out.println("введите длину стороны ромба");
                int rombSide = enter.nextInt();


                System.out.println("площадь ромба равна " + (rombH * rombSide));


            }

            /*else if (input.equals("сторона и высота")) {
                System.out.println("введите высоту ромба");
                int rombH = enter.nextInt();
                System.out.println("введите длину стороны ромба");
                int rombSide = enter.nextInt();


                System.out.println("площадь ромба равна " + (rombH * rombSid
}

*/

            else if (input.equals("диагонали")) {
                System.out.println("введите значение первой диагонали:");
                int diagonalA = enter.nextInt();
                System.out.println("введите значение второй диагонали:");
                int diagonalB = enter.nextInt();

                System.out.println("площадь ромба равна " + (0.5 * (diagonalA + diagonalB)));

            } else {
                System.out.println("вы ввели что то не то");
            }


        } else if (inputMain.equals("периметр")) {
            System.out.println("введите длину стороны ромба:");
            int rombSide = enter.nextInt();

            System.out.println("периметр ромба равен " + (rombSide * 4));


        } else {
            System.out.println("вы ввели не те параметры");
        }

    }
}