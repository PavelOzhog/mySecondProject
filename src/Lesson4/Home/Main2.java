package Lesson4.Home;

public class Main2 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";


        String[] text2 = text.split(" ");

        for (int i = text2.length - 1; i >= 0; i--) {

            System.out.println(text2[i]);
        }

//        for (String Ctext:text2) {
//
//            System.out.println(Ctext);
//        }


    }
}
