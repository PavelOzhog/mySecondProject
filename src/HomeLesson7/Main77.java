



package HomeLesson7;



public class Main77 {
    public static void main(String[] args) {
        int[][] massivA = new int[5][5];

//        System.out.print(massivA[0][0]);
//        System.out.print(massivA[0][1]);
//        System.out.print(massivA[0][2]);
//        System.out.print(massivA[0][3]);
//
//        System.out.println();
//
//        System.out.print(massivA[1][0]);
//        System.out.print(massivA[1][1]);
//        System.out.print(massivA[1][2]);
//        System.out.print(massivA[1][3]);
//
//
//
//        System.out.print(massivA[2][0]);
//        System.out.print(massivA[2][1]);
//        System.out.print(massivA[2][2]);
//        System.out.print(massivA[2][3]);
//
//        System.out.println();
//
//
//        System.out.print(massivA[3][0]);
//        System.out.print(massivA[3][1]);
//        System.out.print(massivA[3][2]);
//        System.out.print(massivA[3][3]);

int index = 4;
        for (int i = 0; i < massivA.length; i++) {

            for (int j = 0; j < massivA[i].length ; j++) {
                if (  i == j || j == index ) {
                    System.out.print(massivA[i][j] + " ");

                }else {

                    System.out.print(" " + " ");
                }

            }

            System.out.println(" ");
index--;
        }


    }
}