package Trenirovka2;

public class Calcul {
  //  char[] chars = ("" + i).toCharArray();
    public static int [] calc (int []  massiv, char chislo){

        int kol = 0;
      for (int i = 0; i < massiv.length; i ++){
            char[] chars = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < chars.length; j ++){
                if (chars [j] == chislo){
                    kol = kol + 1;
                }
            }
        }


        int [] result = new int [kol];
       int index = 0;
        for (int i = 0; i < massiv.length; i ++){
            char[] chars = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < chars.length; j ++){
                if (chars [j] == chislo){
                   result [index] = massiv[i];
                index++;
                }
            }
        }


            return result ;



















    }


}
