package HomeLesson5;

public class Main1 {
    public static void main(String[] args) {
        String text = "Joker is the coolest guy that i know";
        String[] textAfterTrim = text.split(" ");
        String[] result = new String[textAfterTrim.length];

//
//        for (int i = 0, j = textAfterTrim.length - 1; i < textAfterTrim.length ; i++, j-- ){
//
//            System.out.println(textAfterTrim[j]);
//
//        }



        for (int i = 0; i < textAfterTrim.length; i++){

            for (int j = textAfterTrim.length - 1; j >= 0; j--){
                result[i] = textAfterTrim[j];

            }
            System.out.println(result[i]);
        }


    }

}

