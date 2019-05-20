

package lesson3;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main55 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("ведите ваше имя");
//
//        String inputName =  scanner.nextLine();


//        System.out.println("привет " + inputName);

        System.out.println("введите сторону A");
        int inputSideA = scanner.nextInt();

        System.out.println("введите сторону В");
        int inputSideB = scanner.nextInt();

        System.out.println("введите осонование С");
        int inputBaselineC = scanner.nextInt();

        System.out.println("введите высоту H ");
        int inputHeightH = scanner.nextInt();


        System.out.println("вы хотите посчитать площадь или периметр?");
        String action =  scanner.next();




            if (action.equals("периметр")){
                System.out.println("периметр треугольника = " + (inputSideA + inputSideB + inputBaselineC));
            }
            else {
                System.out.println( " площадь треугольника = " + 0.5 * (inputBaselineC * inputHeightH));

            }


    }


}
