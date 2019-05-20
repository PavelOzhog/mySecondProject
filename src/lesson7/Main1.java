package lesson7;

public class Main1 {
    public static void main(String[] args) {
        int[][] massive = new int[4][4];
//        System.out.print(massive[0][0] + " ");
//        System.out.print(massive[0][1] + " ");
//        System.out.print(massive[0][2] + " ");
//        System.out.print(massive[0][3] + " ");
//        System.out.println();
//
//        System.out.print(massive[1][0] + " ");
//        System.out.print(massive[1][1] + " ");
//        System.out.print(massive[1][2] + " ");
//        System.out.print(massive[1][3] + " ");
//        System.out.println();
//
//        System.out.print(massive[2][0] + " ");
//        System.out.print(massive[2][1] + " ");
//        System.out.print(massive[2][2] + " ");
//        System.out.print(massive[2][3] + " ");
//        System.out.println();


        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (i == j) {
                    System.out.print(massive[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }


//        System.out.println(massive[0][0]);
//        System.out.println(massive[1][0]);
//        System.out.println(massive[2][0]);
//        System.out.print(massive[3][0]);
//        System.out.print(massive[3][1]);
//        System.out.print(massive[3][2]);
//        System.out.print(massive[3][3]);



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (j == 0 || i ==3) {
                    System.out.print(massive[i][j] + " ");

                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }


        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if (j == 0 || i ==3) {
                    System.out.print(massive[i][j] + " ");

                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }


}

