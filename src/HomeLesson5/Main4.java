package HomeLesson5;

public class Main4 {

        public static void main(String[] args) {
            String text = "Language  java ааааааааааааааа";
            char [] symbolsFromText = text.toCharArray();
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            for (int i = 0; i < text.length() - 1; i++ ){
                System.out.println(symbolsFromText[i] + "-" + alphabet.indexOf(symbolsFromText[i]));



            }


        }
    }



