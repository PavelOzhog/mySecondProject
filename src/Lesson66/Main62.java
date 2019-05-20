package Lesson66;

public class Main62 {
    public static void main(String[] args) {
        String text1 = " I am a student";
        String text2 = "I am a teacher";
        char[] fromText1 = text1.toCharArray();
        char[] fromText2 = text2.toCharArray();
        for (int i = 0; i < fromText1.length; i++) {
            for (int j = 0; j < fromText2.length; j++) {
                if (fromText1[i] == fromText2[j] && fromText1[i] != ' '){
                    System.out.println(fromText1[i]);
                    break;
                }

            }

        }

    }
}
