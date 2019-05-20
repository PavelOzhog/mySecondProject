package Lesson8;

public class Metods {

    public static int summaChiselBy5(int[] massive) {
        int summChilesby5 = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                summChilesby5 += massive[i];

            }
        }
        return summChilesby5;
    }


    public static String getSameChars(String text1, String text2) {
        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();
        String result = "";

        for (int i = 0; i < charsFromText1.length; i++) {
            for (int j = 0; j < charsFromText2.length; j++) {
                if (charsFromText1[i] == charsFromText2[j]) {
                    result += charsFromText1[i];
                    break;
                }
            }
        }

        return result;
    }
}