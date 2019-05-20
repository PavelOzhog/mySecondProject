package Lesson4.Home;

public class Main5 {
    public static void main(String[] args) {
        String[] letters = {"a", "b", "c", "d"};
        String[] letters_2 = {"q", "w", "e", "r"};
        String text = "Are you ready to start studying of programming?";
        String text2 = text.toLowerCase();
        // System.out.println(text2);
        String toBeAble = "qre you reqry to stqrt sturying of progrqmming?";

        String text3 = text2.replace("a", "q");
        String text4 = text3.replace("b", "w");
        String text5 = text4.replace("c", "e");
        String text6 = text5.replace("d", "r");

        System.out.println(text6);


        if (text6.equals(toBeAble)) {
            System.out.println("complete");
        } else {
            System.out.println("no future");
        }





    }


}

