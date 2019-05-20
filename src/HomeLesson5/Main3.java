package HomeLesson5;

public class Main3 {
    public static void main(String[] args) {
        String text = "Java is the greatest programming language in the world!";
        String[] words = text.split(" ");
        String[] words2 = new String[words.length];


        //
//
//        for ( int i = 0 , j = words.length -1; i < words.length, j > 0 ;  i ++, j--){
//            words[i] = words2[j];
//            System.out.println(words[i]);
//        }

        for (int i = 0; i < words.length - 1; i++) {

            for (int j = words.length -1; j >= 0; j--) {

                words2[j] = words[i];
                System.out.println(words2[j]);
            }

        }


    }
}

