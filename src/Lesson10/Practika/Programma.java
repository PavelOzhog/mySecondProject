package Lesson10.Practika;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("выберите фигуру");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Круг");

        Scanner enter = new Scanner(System.in);

        String inputFigura = enter.nextLine();
        Figura figura = null;
        if (inputFigura.equals("1")) {
//            Treug treug = new Treug();
            System.out.println("Введитесторону A");
            String storonA = enter.nextLine();

            System.out.println("введите сторону Б");
            String storonB = enter.nextLine();

            System.out.println("введите сторону С");
            String storonC = enter.nextLine();

            int stA = Integer.parseInt(storonA);
            int stB = Integer.parseInt(storonB);
            int stC = Integer.parseInt(storonC);

//            treug.setA(stA);
//            treug.setA(stB);
//            treug.setA(stC);

            figura = new Treug(stA, stB, stC);

        }

        if (inputFigura.equals("2")) {
            //Pramoug pram = new Pramoug();

            System.out.println("Введите сторону A");
            String storonA = enter.nextLine();

            System.out.println("введите сторону Б");
            String storonB = enter.nextLine();

            int stA = Integer.parseInt(storonA);
            int stB = Integer.parseInt(storonB);

//            pram.setA(stA);
//            pram.setA(stB);
            figura = new Pramoug(stA, stB);

        }
        if (inputFigura.equals("3")) {

            System.out.println("Введитесторону A");
            String storonA = enter.nextLine();

            int stA = Integer.parseInt(storonA);
            figura = new Kvadrat(stA);

        }

        if (inputFigura.equals("4")) {

            System.out.println("Введите радиус");
            String rad = enter.nextLine();


            int r = Integer.parseInt(rad);


            figura = new Round(r);

        }

        System.out.println(" периметр или площадь или длина круга");
        String inputAction = enter.nextLine();

        if (inputAction.equals("периметр")) {
            figura.printPerimetr();
        }

      else   if (inputAction.equals("длина круга")){
            figura.printDlinaRound();
        }

        else {
            figura.printPloshad();
        }


    }


}
