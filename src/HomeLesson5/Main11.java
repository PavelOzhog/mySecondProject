package HomeLesson5;

public class Main11 {
    public static void main(String[] args) {
            String text = "Java learning is very complex, but such interesting! ";
            String text2 = "The Infinity War has ignited, and the Avengers will never be the same.";
            char[] textCahrs = text.toCharArray();
             char[] text2Chars = text2.toCharArray();
            char[] fin = new char[text2Chars.length];

            for (int i = 0; i < textCahrs.length; i++) {
                for (int j = 0; j < text2Chars.length; j++) {
                    if (textCahrs[i] == text2Chars[j]) {
                           fin[i] = text2Chars[j];
                    }
                }
                System.out.println(fin[i]);
            }
        }
    }
