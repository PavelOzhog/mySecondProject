package lesson3.lesson3homework;



import java.util.Scanner;

public class Paral {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        System.out.println("что вы хотите посчитать: периметр или площадь?");
        String inputText = enter.next();


        if (inputText.equals("площадь")) {
            System.out.println("введите высоту");

            int hPar = enter.nextInt();

            System.out.println("введите основание");
            int basicLine = enter.nextInt();



            System.out.println("площадь трапеции равна " + (0.5 * (hPar * basicLine)));


        }
        else if(inputText.equals("периметр") ){

            System.out.println("введите сторону А");
            int sideA = enter.nextInt();



            System.out.println("введите сторону В");

            int sideB = enter.nextInt();


            System.out.println("периметр трапеции равен " + (2 * (sideA + sideB) ));

        }
        else {
            System.out.println(" вы ввели не те параметры");

        }
    }
}