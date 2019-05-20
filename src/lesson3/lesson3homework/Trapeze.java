package lesson3.lesson3homework;

import java.util.Scanner;
public class Trapeze {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("что вы хотите посчитать: периметр или площадь трапеции?");
        String inputText = enter.next();


        if (inputText.equals("площадь")) {
            System.out.println("введите высоту трапеции");

            int hTrap = enter.nextInt();

            System.out.println("введите меньшее основание");
            int basicLineSmall = enter.nextInt();

            System.out.println("введите большее основание");
            int basicLineBig = enter.nextInt();

            System.out.println("площадь трапеции равна " + (0.5 * hTrap * (basicLineSmall + basicLineBig)));


        }
        else if(inputText.equals("периметр") ){

            System.out.println("ведите меньшее основание");
            int basicLineSmall = enter.nextInt();



            System.out.println("введите большее основание");

            int basicLineBig = enter.nextInt();


            System.out.println("введите левую непаралельную сторону");

            int leftLine = enter.nextInt();

            System.out.println("введите правую непаралельную сторону");

        int rightLine = enter.nextInt();

            System.out.println("периметр трапеции равен " + (basicLineSmall + basicLineBig + leftLine + rightLine ));

        }
else {
            System.out.println(" вы ввели не те параметры");

    }
}
}