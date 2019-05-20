package HomeLesson6;

public class StringUtils {

    public static String reverse(String text) {


//        char[]afterText = text.toCharArray();
//        char []reverse = new char[afterText.length];

//        for (int i = 0; i  < afterText.length; i++) {
//            for (int j = afterText.length; j > 0 ; j ++) {
//
//                System.out.println(reverse[i]);
//            }
//        }
        String textReverse = new StringBuilder(text).reverse().toString();

        System.out.println(textReverse);
        return textReverse;
    }
//A, E, I, O, U





    public static int countGlass(String text){
        int chisloGlasn = 0;
       char[] afterText = text.toCharArray();
       for (int i =0; i < afterText.length; i++){
           if (afterText[i]=='a'||afterText[i]=='e'||afterText[i]=='i'||afterText[i]=='o'||afterText[i]=='u'||
           afterText[i]=='A'||afterText[i]=='E'||afterText[i]=='I'||afterText[i]=='O'||afterText[i]=='U'){
               chisloGlasn++;
           }
       }
        System.out.println(chisloGlasn);
        return chisloGlasn;

    }

    public static int countSoglasnie(String text){
        int chisloSoglasn = 0;
        char[] afterText = text.toCharArray();
        for (int i =0; i < afterText.length; i++){
            if (afterText[i]!='a'||afterText[i]!='e'||afterText[i]!='i'||afterText[i]!='o'||afterText[i]!='u'||
                    afterText[i]!='A'||afterText[i]!='E'||afterText[i]!='I'||afterText[i]!='O'||afterText[i]!='U'||
                    afterText[i]!=' '||afterText[i]!='.'||afterText[i]!='!'||afterText[i]!='?'||afterText[i]!=';'||
                    afterText[i]!=':'||afterText[i]!='-'||afterText[i]!='!'||afterText[i]!='?'||afterText[i]!=';'){
                chisloSoglasn++;
                                }
                                }
        System.out.println(chisloSoglasn);
return chisloSoglasn;

    }



}
