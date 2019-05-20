package Trenirovka2;

public class Main1 {
    public static void main(String[] args) {

        int [] nums = {4 ,42,5,23,5434,22,453};


        int [] ch = Calcul.calc(nums, '4');

for (int i = 0 ; i < ch.length; i++){
    System.out.println(ch[i]);
}

    }
}
