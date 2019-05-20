package Trenirovka90.Calcul;
import java.util.Scanner;


public class Calculator {



 public static int getSumma (){
     Scanner enter = new Scanner(System.in);
     System.out.println("введите число a");
   int chA = enter.nextInt();
    int a = 1 ;

     if (chA == 1||chA == 2||chA == 3 ||chA == 4||chA ==5||chA ==6||chA ==7||chA ==8||chA ==9||chA ==0){
        a = chA;
     }else {
         System.out.println("вы ввели неверное число");
           return Calculator.getSumma();
     }

     System.out.println("введите число b");
     int chB = enter.nextInt();
     int b = 0;
     if (chB == 1||chB == 2||chB == 3 ||chB == 4||chB ==5||chB ==6||chB ==7||chB ==8||chB ==9||chB ==0){
         b = chB;
     }else {
         System.out.println("вы ввели неверное число");
         return Calculator.getSumma();
     }

   int  summa = a + b;
     return summa;
 }









}
