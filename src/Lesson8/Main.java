package Lesson8;

public class Main {
    public static void main(String[] args) {


        int[] massiv = {324, 4234, 55, 234, 5352};
        int summ = Metods.summaChiselBy5(massiv);
        System.out.println(summ);


        String text1 = ("Worldttf");
        String text2 = (" Safety");
        String result = Metods.getSameChars(text1, text2);
        System.out.println(result);

    }
}
