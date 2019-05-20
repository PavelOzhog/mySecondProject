package lesson3.lesson3homework;


import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {

    Scanner enter = new Scanner(System.in);

        System.out.println("введите радиус окружности");

    int radius = enter.nextInt();








        System.out.println("вы хотите посчитать площадь или длину окружности?");
       String inputText =  enter.next();




       if(inputText.equals("площадь")) {
            System.out.println("площадь окружности равна " + (3.14 * ( radius * radius)));

        }
        else if(inputText.equals("длина")){


            System.out.println("длина окружности равна " + (radius * 2 * 3.14 ));
        }
        else {
           System.out.println("вы указали что то не то");
       }



    }
}
