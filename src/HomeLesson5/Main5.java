package HomeLesson5;

public class Main5 {
    public static void main(String[] args) {
        char[] first = {'q', 'w', 'e', 'r', 't'};
        char[] second = {'a', 'b', 'c', 'd', 'e'};

        char[] third = {'Q', 'W', 'E', 'R', 'T'};
        char[] forth = {'A', 'B', 'C', 'D', 'E'};

        String text = "are you ready to star studying of programming";

        char[] textRes = text.toCharArray();

        for (int i = 0; i < textRes.length -1; i++) {
            for (int j = 0; j < first.length; j++) {
                if (textRes[i] ==first[j] ) {
                    textRes[i] = second[j];


                }
            }

            System.out.println(textRes[i]);
        }
//        for (int i = 0; i < textRes.length -1; i++) {
//            for (int j = 0; j < second.length; j++) {
//                if (textRes[i] ==second[j] ) {
//                    textRes[i] = second[j];
//
//
//                }
//            }

        }

    }
