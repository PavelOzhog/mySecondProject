package HomeLesson5;

public class Main9 {
    public static void main(String[] args) {
        String text = "Java learning is very complex, but such interesting! ";
        char[] textChars = text.toCharArray();
        char[] glasnLetters = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] soglasnLetters = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
        char[]znaki = {'.',',','-',':',';','?','!'};
        int glasn = 0;
        int soglasn = 0;
       int countZnaki = 0;
        for (int i = 0; i < textChars.length; i++) {
            for (int j = 0; j < glasnLetters.length; j++) {
                if (textChars[i] == glasnLetters[j]) {
                    glasn++;
                }
            }
        }
        System.out.println("гласных " + glasn);
        for (int i = 0; i < textChars.length; i++) {
            for (int j = 0; j < soglasnLetters.length; j++) {
                if (textChars[i] == soglasnLetters[j]) {
                    soglasn++;
                }
            }
        }
        System.out.println("coгласных букв " + soglasn);

        for (int i = 0; i < textChars.length; i++) {
            for (int j = 0; j < znaki.length; j++) {
                if (textChars[i] == znaki[j]) {
                   countZnaki++;
                }
            }
        }
        System.out.println("количество знаков препинания " + countZnaki);
    }
}