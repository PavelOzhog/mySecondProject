package Lesson8;

public class Main3 {
    public static void main(String[] args) {
 int [] massiv = {55,7787, 1877,65, 8, 9,676 , 4535698, 6645};
int [] newMassiv = Nums.getIndex(massiv, '4');
        for (int i = 0; i < newMassiv.length; i++){
            System.out.println(newMassiv[i]);
        }


    int [] mnogoChisel = {666, 56,33,65, 676, 7776};
        int [] newMnogo = Work.getChisla(mnogoChisel, '6');
        for (int i = 0; i < newMnogo.length; i++){
            System.out.println(newMnogo[i]);
        }

    }
}
