package Lesson8;

public class Work {

    public static int[] getChisla(int[] massiv, char chislo) {

        int dlinaMassiva = 0;
        char[] massivChisel = new char[dlinaMassiva];


        for (int i = 0; i < massiv.length; i++) {
            massivChisel = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < massivChisel.length; j++) {
                if (massivChisel[j] == chislo) {
                    dlinaMassiva++;
                    break;

                }
            }
        }

        int[] result = new int[dlinaMassiva];
        int num = 0;
        for (int i = 0; i < massiv.length; i++) {
            massivChisel = ("" + massiv[i]).toCharArray();

            for (int j = 0; j < massivChisel.length; j++) {
                if (massivChisel[j] == chislo) {
                result[num] = massiv[i];
                    num++;
                    break;
                }


            }
        }
        return result;

    }
}