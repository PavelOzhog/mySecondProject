package Lesson4.Home;

public class Main4 {
    public static void main(String[] args) {
        //String [] signs = {"a","b","c","d"};
        //signs.charAt
        //   a b c d
        // System.out.println(signs[]);
        char[] signs = {'a', 'b', 'c', 'd'};                        //    d c b a
        String s2 = "";


        for (int i = signs.length - 1; i >= 0; i--) {
            s2 = s2 + signs[i];

        }


        char[] signs2 = s2.toCharArray();

        System.out.println(signs2);




    }
}
