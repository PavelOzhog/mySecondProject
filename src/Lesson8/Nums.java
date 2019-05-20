package Lesson8;

public class Nums {

    public static int[] getIndex(int[] massiv, char chislo) {
        int indexOfNums = 0;
        char[] afterNums = new char[indexOfNums];

        for (int i = 0; i < massiv.length; i++) {
            afterNums = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < afterNums.length; j++) {
                if (afterNums[j] == chislo) {
                    indexOfNums++;
               break;
                }
            }
        }


        int[] result = new int[indexOfNums];
        int index = 0;
        for (int i = 0; i < massiv.length; i++) {
            afterNums = ("" + massiv[i]).toCharArray();

            for (int j = 0; j < afterNums.length; j++){
                if (afterNums[j] == chislo) {
                    result[index] = massiv[i];
                    index++;
                    break;
                }
                }
        }
        return result;
    }
}
