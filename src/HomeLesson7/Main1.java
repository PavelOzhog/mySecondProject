package HomeLesson7;

public class Main1 {
    public static void main(String[] args) {
        int[][] massiv = new int[5][5];

//        for (int i = 0; i < massiv.length; i++) {
//            for (int j = 0; j < massiv.length; j++) {
//                System.out.print(massiv[i][j]);
////            }
//            System.out.println();
//        }
        int f = massiv[0].length - 1;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (i == j || j == f) {
                    System.out.print(massiv[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(" ");
            f--;
        }


        int[][] massiv1 = new int[3][3];
        int c = massiv1[0].length;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                if (j == c) {
                    System.out.print(massiv[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(" ");
            c--;
        }

        int[][] massiv2 = new int[3][3];
        // int c = massiv1[0].length ;
        for (int i = 0; i <= massiv2.length; i++) {
            for (int j = 0; j <= massiv2.length; j++) {
                if (j == 0 || i == massiv2.length) {
                    System.out.print(massiv[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println(" ");
        }
    }
}
